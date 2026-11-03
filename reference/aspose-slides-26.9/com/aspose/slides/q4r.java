package com.aspose.slides;

class q4r extends a8m<ISlidesPicture, q4r> {
   public static final q4r n5 = new q4r();

   protected boolean n5(ISlidesPicture var1, ISlidesPicture var2) {
      return com.aspose.slides.ms.System.j8.l6(var1.getImage(), var2.getImage())
         && com.aspose.slides.ms.System.d1.a6(var1.getLinkPathLong(), var2.getLinkPathLong())
         && this.n5(var1.getImageTransform(), var2.getImageTransform());
   }

   protected int n5(ISlidesPicture var1) {
      int var2 = -324743029 + k5(var1.getImage());
      var2 = var2 * 486187739 + k5(var1.getLinkPathLong());
      return var2 * 486187739 + this.n5(var1.getImageTransform());
   }

   private boolean n5(IImageTransformOperationCollection var1, IImageTransformOperationCollection var2) {
      if (var1 == null && var2 == null) {
         return true;
      }

      if (var1 != null && var2 != null) {
         if (var1.size() != var2.size()) {
            return false;
         }

         for (int var3 = 0; var3 < var1.size(); var3++) {
            IImageTransformOperation var4 = var1.get_Item(var3);
            IImageTransformOperation var5 = var2.get_Item(var3);
            if (!com.aspose.slides.internal.n8e.v4.n5(var4, var5)) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private int n5(IImageTransformOperationCollection var1) {
      if (var1 == null) {
         return 0;
      }

      int var2 = 17;

      for (int var3 = 0; var3 < var1.size(); var3++) {
         var2 = var2 * 486187739 + var1.get_Item(var3).hashCode();
      }

      return var2;
   }
}
