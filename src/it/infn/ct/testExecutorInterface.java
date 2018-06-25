/**************************************************************************
Copyright (c) 2011:
Istituto Nazionale di Fisica Nucleare (INFN), Italy
See http://www.infn.it for details on the copyright holders.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
    http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
@author <a href="mailto:riccardo.bruno@ct.infn.it">Riccardo Bruno</a>(INFN)
****************************************************************************/
package it.infn.ct;

/**
 * Define test executor interface
 */
class testExecutorInterface implements ExecutorInterface {
    
    public testExecutorInterface() {
        LOG.info("Inititlizing executor interface: '" + getClass().getName() + "'");
    }

    @Override
    public void Clean() {
        LOG.info("testExecutorInterface Clean method called.");
    }
    @Override
        public void Submit() {
        LOG.info("testExecutorInterface Submit method called.");
    }
    @Override
        public void getStatus() {
        LOG.info("testExecutorInterface getStatus method called.");
    }
    @Override
        public void getOutput() {
        LOG.info("testExecutorInterface getOutput method called.");
    }
    @Override
       public void Cancel() {
       LOG.info("testExecutorInterface Cancel method called.");
    }
    @Override
       public void Delete() {
       LOG.info("testExecutorInterface Delete method called.");
    }
}
