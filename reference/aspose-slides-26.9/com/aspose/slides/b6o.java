package com.aspose.slides;

class b6o extends c9 {
   private final IVideo n5;

   public b6o(IVideo var1) {
      this.n5 = var1;
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.t4 var1) {
      byte[] var2 = this.n5.getBinaryData();
      var1.write(var2, 0, var2.length);
   }
}
