package components.box.cmp.map


import androidx.compose.runtime.Composable
import androidx.compose.ui.viewinterop.UIKitView
import kotlinx.cinterop.ExperimentalForeignApi
import platform.CoreGraphics.CGRectMake
import platform.UIKit.UIView

@Composable
actual fun YandexMapView() {
//    UIKitView(factory = {
//        createYandexMapView()
//    })
}

//@OptIn(ExperimentalForeignApi::class)
//private fun createYandexMapView(): UIView {
//    val mapView = YMKMapView(frame = CGRectMake(0.0, 0.0, 0.0, 0.0))
//
//    val cameraPosition = YMKCameraPosition(
//        target = YMKPoint(latitude = 55.751244, longitude = 37.618423),
//        zoom = 14.0,
//        azimuth = 0.0,
//        tilt = 0.0
//    )
//    mapView.mapWindow.map.move(cameraPosition)
//
//    return mapView
//}