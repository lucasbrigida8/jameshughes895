/*
 * Copyright (C) 2014-present, Wei Chou (weichou2010@gmail.com)
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

package hobby.wei.c.receiver;

import android.content.Context;
import android.content.Intent;

/**
 * @author 周伟 Wei Chou(weichou2010@gmail.com)
 */
public abstract class AbsRcvrObservable<O extends Observer, DATA> extends Observable<O, AbsRcvrObservable.Tuple, DATA> {
    public static class Tuple {
        public final Context context;
        public final Intent intent;

        public Tuple(Context context, Intent intent) {
            this.context = context;
            this.intent = intent;
        }
    }

    /*Intent service = new Intent(context, DownloadService.class);
    INetObserver binder = (INetObserver)peekService(context, service);
    if(binder != null) binder.notifyNetworkStateChange();*/
}
