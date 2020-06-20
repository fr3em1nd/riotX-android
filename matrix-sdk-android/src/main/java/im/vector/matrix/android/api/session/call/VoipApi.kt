/*
 * Copyright (c) 2020 New Vector Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package im.vector.matrix.android.api.session.call

import im.vector.matrix.android.internal.network.NetworkConstants
import retrofit2.Call
import retrofit2.http.GET

// TODO Move to internal
internal interface VoipApi {

    @GET(NetworkConstants.URI_API_PREFIX_PATH_R0 + "voip/turnServer")
    fun getTurnServer(): Call<TurnServerResponse>
}