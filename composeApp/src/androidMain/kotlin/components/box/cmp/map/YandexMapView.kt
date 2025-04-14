package components.box.cmp.map

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.viewinterop.AndroidView
import com.yandex.mapkit.MapKitFactory
import com.yandex.mapkit.geometry.Point
import com.yandex.mapkit.map.CameraPosition
import com.yandex.mapkit.mapview.MapView
import components.box.cmp.BuildConfig

@Composable
actual fun YandexMapView() {
    AndroidView(factory = { context: Context ->
        MapKitFactory.setApiKey(BuildConfig.YANDEX_MAPS_API_KEY)
        MapKitFactory.initialize(context)

        val mapView = MapView(context)
        mapView.mapWindow.map.move(
            CameraPosition(Point(55.751244, 37.618423), 14.0f, 0.0f, 0.0f)
        )
        mapView
    })
}