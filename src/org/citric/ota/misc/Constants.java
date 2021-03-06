/*
 * Copyright (C) 2017 The LineageOS Project
 * Copyright (C) 2021 The CitricOS Project
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
package org.citric.ota.misc;

public final class Constants {
    public static final String AB_PAYLOAD_BIN_PATH = "payload.bin";
    public static final String AB_PAYLOAD_PROPERTIES_PATH = "payload_properties.txt";
    public static final String PREF_NEEDS_REBOOT_ID = "needs_reboot_id";
    public static final String PREF_MOBILE_DATA_WARNING = "pref_mobile_data_warning";
    public static final String UNCRYPT_FILE_EXT = ".uncrypt";
    public static final String PROP_BUILD_DATE = "org.citric.build_date_utc";
    public static final String PROP_RECOVERY_UPDATE = "persist.sys.recovery_update";
    public static final String PREF_INSTALL_OLD_TIMESTAMP = "install_old_timestamp";
    public static final String PREF_INSTALL_NEW_TIMESTAMP = "install_new_timestamp";
    public static final String PREF_INSTALL_NEW_FILE_NAME = "install_new_file_name";
    public static final String PREF_INSTALL_PACKAGE_PATH = "install_package_path";
    public static final String PREF_INSTALL_AGAIN = "install_again";
    public static final String PREF_INSTALL_NOTIFIED = "install_notified";
    public static final String DOWNLOAD_PATH = "/data/system_updates/";
    static final String PROP_AB_DEVICE = "ro.build.ab_update";
    static final String PROP_DEVICE = "org.citric.device";
    static final String PROP_BUILD_VERSION = "org.citric.version";
    static final String PROP_VERSION_CODE = "org.citric.ota.version_code";
    static final String OTA_URL = "https://raw.githubusercontent.com/CitricOS-Devices/OTA/master/builds/%s.json";
    static final String DOWNLOAD_WEBPAGE_URL = "https://raw.githubusercontent.com/CitricOS-Devices/OTA/master/changelogs/%s/%s.txt";
    static final String EXPORT_PATH = "CitricOS-Updates/";
}
