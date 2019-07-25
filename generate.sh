#!/usr/bin/env bash

project_dir=$( cd "$(dirname "$0")" ; pwd -P )
echo "Project dir: ${project_dir}"

rm -rf ${project_dir}/nifi-swagger-client/*
docker run --rm -v ${project_dir}:/local --user $(id -u):$(id -g) openapitools/openapi-generator-cli:v4.0.1 help generate
docker run --rm -v ${project_dir}:/local --user $(id -u):$(id -g) openapitools/openapi-generator-cli:v4.0.1 generate \
    --skip-validate-spec \
    -DmodelDocs=true \
    -i /local/swagger-1.9.2.json \
    -g java \
    --artifact-id nifi-swagger-client \
    --artifact-version 1.9.2 \
    --package-name com.github.andrewkav \
    --invoker-package com.github.andrewkav \
    --model-package com.github.andrewkav.model \
    --api-package com.github.andrewkav.api \
    -o /local/nifi-swagger-client
