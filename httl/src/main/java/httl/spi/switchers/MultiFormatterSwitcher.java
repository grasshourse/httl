/*
 * Copyright 2011-2013 HTTL Team.
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package httl.spi.switchers;

import httl.spi.Formatter;
import httl.spi.Switcher;
import httl.util.Reqiured;

/**
 * MultiFormatterSwitcher. (SPI, Singleton, ThreadSafe)
 *
 * @author Liang Fei (liangfei0201 AT gmail DOT com)
 * @see httl.spi.translators.CompiledTranslator#setFormatterSwitcher(Switcher)
 * @see httl.spi.translators.InterpretedTranslator#setFormatterSwitcher(Switcher)
 */
public class MultiFormatterSwitcher extends MultiSwitcher<Formatter<Object>> {

    /**
     * httl.properties: formatter.switchers=httl.spi.switchers.StyleFormatterSwitcher
     */
    @Reqiured
    public void setFormatterSwitchers(Switcher<Formatter<Object>>[] switchers) {
        setSwitchers(switchers);
    }

}