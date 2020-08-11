package com.sunnyweather.android.logic.model

import com.google.gson.annotations.SerializedName

data class RealtimeResponse(val status: String, val result: Result) {

    data class Result(val realtime: Realtime)

    data class Realtime(
        val skycon: String, val temperature: Float,
        @SerializedName("air_quality") val airQuality: AirQuality
    )

    data class AirQuality(val aqi: AQI)

    data class AQI(val chn: Float)
}

/*
{
  "status": "ok",
  "api_version": "v2.5",
  "api_status": "active",
  "lang": "zh_CN",
  "unit": "metric",
  "tzshift": 28800,
  "timezone": "Asia/Taipei",
  "server_time": 1596376964,
  "location": [
    25.1552,
    121.6544
  ],
  "result": {
    "realtime": {
      "status": "ok",
      "temperature": 29.16,
      "humidity": 0.78,
      "cloudrate": 0.9,
      "skycon": "CLOUDY",
      "visibility": 16,
      "dswrf": 0,
      "wind": {
        "speed": 9,
        "direction": 40
      },
      "pressure": 99005.55,
      "apparent_temperature": 32.3,
      "precipitation": {
        "local": {
          "status": "ok",
          "datasource": "radar",
          "intensity": 0
        },
        "nearest": {
          "status": "ok",
          "distance": 6,
          "intensity": 2
        }
      },
      "air_quality": {
        "pm25": 4,
        "pm10": 0,
        "o3": 0,
        "so2": 0,
        "no2": 0,
        "co": 0,
        "aqi": {
          "chn": 8,
          "usa": 0
        },
        "description": {
          "usa": "",
          "chn": "优"
        }
      },
      "life_index": {
        "ultraviolet": {
          "index": 0,
          "desc": "无"
        },
        "comfort": {
          "index": 0,
          "desc": "闷热"
        }
      }
    },
    "primary": 0
  }
}
*/