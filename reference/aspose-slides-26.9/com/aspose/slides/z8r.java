package com.aspose.slides;

class z8r extends a8m<IPictureFillFormat, z8r> {
   public static final z8r n5 = new z8r();

   protected boolean n5(IPictureFillFormat var1, IPictureFillFormat var2) {
      return var1.getDpi() == var2.getDpi()
         && var1.getPictureFillMode() == var2.getPictureFillMode()
         && com.aspose.slides.internal.n8e.v4.n5(var1.getCropLeft(), var2.getCropLeft())
         && com.aspose.slides.internal.n8e.v4.n5(var1.getCropTop(), var2.getCropTop())
         && com.aspose.slides.internal.n8e.v4.n5(var1.getCropRight(), var2.getCropRight())
         && com.aspose.slides.internal.n8e.v4.n5(var1.getCropBottom(), var2.getCropBottom())
         && com.aspose.slides.internal.n8e.v4.n5(var1.getStretchOffsetLeft(), var2.getStretchOffsetLeft())
         && com.aspose.slides.internal.n8e.v4.n5(var1.getStretchOffsetTop(), var2.getStretchOffsetTop())
         && com.aspose.slides.internal.n8e.v4.n5(var1.getStretchOffsetRight(), var2.getStretchOffsetRight())
         && com.aspose.slides.internal.n8e.v4.n5(var1.getStretchOffsetBottom(), var2.getStretchOffsetBottom())
         && q4r.n5.equals(var1.getPicture(), var2.getPicture());
   }

   protected int n5(IPictureFillFormat var1) {
      int var2 = -324743029 + com.aspose.slides.ms.System.s3.n5(var1.getPictureFillMode());
      var2 = var2 * 486187739 + q4r.n5.l6(var1.getPicture());
      var2 = var2 * 486187739 + com.aspose.slides.ms.System.n1.n5(var1.getCropLeft());
      var2 = var2 * 486187739 + com.aspose.slides.ms.System.n1.n5(var1.getCropTop());
      var2 = var2 * 486187739 + com.aspose.slides.ms.System.n1.n5(var1.getCropRight());
      var2 = var2 * 486187739 + com.aspose.slides.ms.System.n1.n5(var1.getCropBottom());
      var2 = var2 * 486187739 + com.aspose.slides.ms.System.n1.n5(var1.getStretchOffsetLeft());
      var2 = var2 * 486187739 + com.aspose.slides.ms.System.n1.n5(var1.getStretchOffsetTop());
      var2 = var2 * 486187739 + com.aspose.slides.ms.System.n1.n5(var1.getStretchOffsetRight());
      return var2 * 486187739 + com.aspose.slides.ms.System.n1.n5(var1.getStretchOffsetBottom());
   }
}
