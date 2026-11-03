package com.aspose.slides;

class y7o extends a8m<ILineFormat, y7o> {
   public static final y7o n5 = new y7o();

   protected boolean n5(ILineFormat var1, ILineFormat var2) {
      return var1.isFormatNotDefined() == var2.isFormatNotDefined()
         && com.aspose.slides.internal.n8e.v4.n5(var1.getWidth(), var2.getWidth())
         && var1.getDashStyle() == var2.getDashStyle()
         && var1.getCapStyle() == var2.getCapStyle()
         && var1.getStyle() == var2.getStyle()
         && var1.getAlignment() == var2.getAlignment()
         && var1.getJoinStyle() == var2.getJoinStyle()
         && com.aspose.slides.internal.n8e.v4.n5(var1.getMiterLimit(), var2.getMiterLimit())
         && var1.getBeginArrowheadStyle() == var2.getBeginArrowheadStyle()
         && var1.getEndArrowheadStyle() == var2.getEndArrowheadStyle()
         && var1.getBeginArrowheadWidth() == var2.getBeginArrowheadWidth()
         && var1.getEndArrowheadWidth() == var2.getEndArrowheadWidth()
         && var1.getBeginArrowheadLength() == var2.getBeginArrowheadLength()
         && var1.getEndArrowheadLength() == var2.getEndArrowheadLength()
         && this.n5(var1.getCustomDashPattern(), var2.getCustomDashPattern())
         && o1u.n5.equals(var1.getFillFormat(), var2.getFillFormat())
         && b2t.n5.equals(var1.getSketchFormat(), var2.getSketchFormat());
   }

   protected int n5(ILineFormat var1) {
      int var2 = -324743029 + com.aspose.slides.ms.System.n3.n5(var1.isFormatNotDefined());
      var2 = var2 * 486187739 + o1u.n5.l6(var1.getFillFormat());
      var2 = var2 * 486187739 + b2t.n5.l6(var1.getSketchFormat());
      var2 = var2 * 486187739 + com.aspose.slides.ms.System.d2.n5(var1.getWidth());
      var2 = var2 * 486187739 + com.aspose.slides.ms.System.s3.n5(var1.getDashStyle());
      var2 = var2 * 486187739 + this.n5(var1.getCustomDashPattern());
      var2 = var2 * 486187739 + com.aspose.slides.ms.System.s3.n5(var1.getCapStyle());
      var2 = var2 * 486187739 + com.aspose.slides.ms.System.s3.n5(var1.getStyle());
      var2 = var2 * 486187739 + com.aspose.slides.ms.System.s3.n5(var1.getAlignment());
      var2 = var2 * 486187739 + com.aspose.slides.ms.System.s3.n5(var1.getJoinStyle());
      var2 = var2 * 486187739 + com.aspose.slides.ms.System.n1.n5(var1.getMiterLimit());
      var2 = var2 * 486187739 + com.aspose.slides.ms.System.s3.n5(var1.getBeginArrowheadStyle());
      var2 = var2 * 486187739 + com.aspose.slides.ms.System.s3.n5(var1.getEndArrowheadStyle());
      var2 = var2 * 486187739 + com.aspose.slides.ms.System.s3.n5(var1.getBeginArrowheadWidth());
      var2 = var2 * 486187739 + com.aspose.slides.ms.System.s3.n5(var1.getEndArrowheadWidth());
      var2 = var2 * 486187739 + com.aspose.slides.ms.System.s3.n5(var1.getBeginArrowheadLength());
      return var2 * 486187739 + com.aspose.slides.ms.System.s3.n5(var1.getEndArrowheadLength());
   }

   private boolean n5(float[] var1, float[] var2) {
      if (var1 == null && var2 == null) {
         return true;
      }

      if (var1 != null && var2 != null) {
         if (var1.length != var2.length) {
            return false;
         }

         for (int var3 = 0; var3 < var1.length; var3++) {
            float var4 = var1[var3];
            float var5 = var2[var3];
            if (!com.aspose.slides.internal.n8e.v4.n5(var4, var5)) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private int n5(float[] var1) {
      if (var1 == null) {
         return 0;
      }

      int var2 = 17;

      for (int var3 = 0; var3 < var1.length; var3++) {
         var2 = var2 * 486187739 + com.aspose.slides.ms.System.n1.n5(var1[var3]);
      }

      return var2;
   }
}
