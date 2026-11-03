package com.aspose.slides;

class s5r extends a8m<IColorFormat, s5r> {
   public static final s5r n5 = new s5r();

   protected boolean n5(IColorFormat var1, IColorFormat var2) {
      return var1.getColorType() == var2.getColorType()
         && com.aspose.slides.internal.o9b.c8.n5(((ColorFormat)var1).u3(), ((ColorFormat)var2).u3())
         && var1.getPresetColor() == var2.getPresetColor()
         && var1.getSystemColor() == var2.getSystemColor()
         && var1.getSchemeColor() == var2.getSchemeColor()
         && var1.getR() == var2.getR()
         && var1.getG() == var2.getG()
         && var1.getB() == var2.getB()
         && com.aspose.slides.internal.n8e.v4.n5(var1.getFloatR(), var2.getFloatR())
         && com.aspose.slides.internal.n8e.v4.n5(var1.getFloatG(), var2.getFloatG())
         && com.aspose.slides.internal.n8e.v4.n5(var1.getFloatB(), var2.getFloatB())
         && com.aspose.slides.internal.n8e.v4.n5(var1.getHue(), var2.getHue())
         && com.aspose.slides.internal.n8e.v4.n5(var1.getSaturation(), var2.getSaturation())
         && com.aspose.slides.internal.n8e.v4.n5(var1.getLuminance(), var2.getLuminance())
         && i8n.n5.equals(var1.getColorTransform(), var2.getColorTransform());
   }

   protected int n5(IColorFormat var1) {
      int var2 = -324743029 + com.aspose.slides.ms.System.s3.n5(var1.getColorType());
      var2 = var2 * 486187739 + com.aspose.slides.ms.System.s3.n5(var1.getPresetColor());
      var2 = var2 * 486187739 + com.aspose.slides.ms.System.s3.n5(var1.getSystemColor());
      var2 = var2 * 486187739 + com.aspose.slides.ms.System.s3.n5(var1.getSchemeColor());
      if (var1.getColorType() != 3) {
         var2 = var2 * 486187739 + ((ColorFormat)var1).u3().hashCode();
         var2 = var2 * 486187739 + com.aspose.slides.ms.System.e2.n5(var1.getR());
         var2 = var2 * 486187739 + com.aspose.slides.ms.System.e2.n5(var1.getG());
         var2 = var2 * 486187739 + com.aspose.slides.ms.System.e2.n5(var1.getB());
         var2 = var2 * 486187739 + com.aspose.slides.ms.System.n1.n5(var1.getFloatR());
         var2 = var2 * 486187739 + com.aspose.slides.ms.System.n1.n5(var1.getFloatG());
         var2 = var2 * 486187739 + com.aspose.slides.ms.System.n1.n5(var1.getFloatB());
         var2 = var2 * 486187739 + com.aspose.slides.ms.System.n1.n5(var1.getHue());
         var2 = var2 * 486187739 + com.aspose.slides.ms.System.n1.n5(var1.getSaturation());
         var2 = var2 * 486187739 + com.aspose.slides.ms.System.n1.n5(var1.getLuminance());
      }

      return var2 * 486187739 + i8n.n5.l6(var1.getColorTransform());
   }
}
