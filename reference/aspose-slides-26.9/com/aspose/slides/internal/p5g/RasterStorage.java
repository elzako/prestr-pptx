package com.aspose.slides.internal.p5g;

import java.awt.image.ComponentSampleModel;
import java.awt.image.DataBufferByte;
import java.awt.image.DataBufferInt;
import java.awt.image.SampleModel;
import java.awt.image.SinglePixelPackedSampleModel;
import java.awt.image.WritableRaster;

/** Public-JDK raster storage access, including translated child raster offsets. */
final class RasterStorage {
   private RasterStorage() { }

   static boolean isInt(WritableRaster raster) {
      return raster.getDataBuffer() instanceof DataBufferInt
         && raster.getDataBuffer().getNumBanks() == 1
         && raster.getSampleModel() instanceof SinglePixelPackedSampleModel;
   }

   static boolean isByte(WritableRaster raster) {
      return raster.getDataBuffer() instanceof DataBufferByte
         && raster.getDataBuffer().getNumBanks() == 1
         && raster.getSampleModel() instanceof ComponentSampleModel;
   }

   static int pixelStride(WritableRaster raster) {
      SampleModel model = raster.getSampleModel();
      return model instanceof SinglePixelPackedSampleModel ? 1 : ((ComponentSampleModel)model).getPixelStride();
   }

   static int scanlineStride(WritableRaster raster) {
      SampleModel model = raster.getSampleModel();
      return model instanceof SinglePixelPackedSampleModel
         ? ((SinglePixelPackedSampleModel)model).getScanlineStride()
         : ((ComponentSampleModel)model).getScanlineStride();
   }

   static int offset(WritableRaster raster) {
      int x = raster.getMinX() - raster.getSampleModelTranslateX();
      int y = raster.getMinY() - raster.getSampleModelTranslateY();
      SampleModel model = raster.getSampleModel();
      int sampleOffset = model instanceof SinglePixelPackedSampleModel
         ? ((SinglePixelPackedSampleModel)model).getOffset(x, y)
         : ((ComponentSampleModel)model).getOffset(x, y, 0);
      return raster.getDataBuffer().getOffset() + sampleOffset;
   }

   static int[] ints(WritableRaster raster) {
      return ((DataBufferInt)raster.getDataBuffer()).getData();
   }

   static byte[] bytes(WritableRaster raster) {
      return ((DataBufferByte)raster.getDataBuffer()).getData();
   }
}
