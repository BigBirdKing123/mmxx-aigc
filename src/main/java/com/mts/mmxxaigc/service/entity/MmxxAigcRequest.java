package com.mts.mmxxaigc.service.entity;

public class MmxxAigcRequest {
        private int opt;
        private String promptMm;
        private String promptXx;
        private String prompt;
        private int steps;
        private int batch;
        private int batchNum;
        private int outNum;
        private String partition;
        private String extendInfo;
        public void setOpt(int opt) {
            this.opt = opt;
        }
        public int getOpt() {
            return opt;
        }

        public void setPromptMm(String promptMm) {
            this.promptMm = promptMm;
        }
        public String getPromptMm() {
            return promptMm;
        }

        public void setPromptXx(String promptXx) {
            this.promptXx = promptXx;
        }
        public String getPromptXx() {
            return promptXx;
        }

        public void setPrompt(String prompt) {
            this.prompt = prompt;
        }
        public String getPrompt() {
            return prompt;
        }

        public void setSteps(int steps) {
            this.steps = steps;
        }
        public int getSteps() {
            return steps;
        }

        public void setBatch(int batch) {
            this.batch = batch;
        }
        public int getBatch() {
            return batch;
        }

        public void setBatchNum(int batchNum) {
            this.batchNum = batchNum;
        }
        public int getBatchNum() {
            return batchNum;
        }

        public void setPartition(String partition) {
            this.partition = partition;
        }
        public String getPartition() {
            return partition;
        }

        public void setOutNum(int outNum) {
            this.outNum = outNum;
        }
        public int getOutNum() {
            return outNum;
        }

        public void setExtendInfo(String extendInfo) {
            this.extendInfo = extendInfo;
        }
        public String getExtendInfo() {
            return extendInfo;
        }
}
