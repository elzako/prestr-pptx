package com.aspose.slides;

import com.aspose.slides.exceptions.InvalidOperationException;

class l7j implements f4k {
   private String n5;
   private String l6;
   private int k5;
   private MarkdownSaveOptions u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9(
      "image/jpeg", "image/x-emf", "image/bmp", "image/png", "image/x-wmf", "image/gif"
   );

   private String l6() {
      return this.n5;
   }

   private void l6(String var1) {
      this.n5 = var1;
   }

   private String k5() {
      return this.l6;
   }

   private void k5(String var1) {
      this.l6 = var1;
   }

   private int u3() {
      return this.k5;
   }

   private void n5(int var1) {
      this.k5 = var1;
   }

   public final MarkdownSaveOptions n5() {
      return this.u3;
   }

   public final void n5(MarkdownSaveOptions var1) {
      this.u3 = var1;
   }

   public l7j(String var1, String var2) {
      this.l6(com.aspose.slides.ms.System.d1.n5("./{0}/", new Object[]{var2}));
      this.k5(com.aspose.slides.internal.z0k.z1.l6(var1, this.l6()));
      com.aspose.slides.internal.z0k.u3.n5(this.k5());
      this.n5(1);
   }

   public l7j(String var1) {
      this(var1, "Images");
   }

   @Override
   public final String n5(IImage var1) {
      byte var2 = 6;
      return this.n5(var1, var2);
   }

   @Override
   public final String n5(IPPImage var1) {
      int var2 = n5(var1.getContentType());
      return this.n5(var1.getImage(), var2);
   }

   @Override
   public final String n5(IShape var1) {
      com.aspose.slides.internal.z0k.e2 var2 = new com.aspose.slides.internal.z0k.e2();

      byte[] var3;
      try {
         var1.writeAsSvg(var2.toOutputStream());
         var3 = var2.toArray();
      } finally {
         var2.dispose();
      }

      String var4 = this.u3("svg");
      String var5 = com.aspose.slides.internal.z0k.z1.l6(this.l6(), var4);
      String var6 = var5;
      String[] var7 = new String[]{var6};
      boolean var8 = this.n5() != null && this.n5().n5(new SvgImage(var3), var7);
      var6 = var7[0];
      if (var8) {
         if (var6 != null && !com.aspose.slides.ms.System.d1.l6(var6).isEmpty()) {
            return var6;
         } else {
            throw new InvalidOperationException("ImageSavingHandler returned true but link is null or empty.");
         }
      } else {
         com.aspose.slides.internal.z0k.n3 var9 = com.aspose.slides.internal.z0k.u9.u9(com.aspose.slides.internal.z0k.z1.l6(this.k5(), var4));

         try {
            var9.write(var3, 0, var3.length);
         } finally {
            var9.dispose();
         }

         return var5;
      }
   }

   protected static int n5(String var0) {
      byte var1 = 5;
      switch (a6.n5(var0)) {
         case 0:
            var1 = 5;
            break;
         case 1:
            var1 = 2;
            break;
         case 2:
            var1 = 1;
            break;
         case 3:
            var1 = 6;
            break;
         case 4:
            var1 = 3;
            break;
         case 5:
            var1 = 4;
      }

      return var1;
   }

   private String u3(String var1) {
      String var2 = com.aspose.slides.ms.System.d1.n5("{0}_{1}.{2}", "Image", this.u3(), var1);
      this.n5(this.u3() + 1);
      return var2;
   }

   private void n5(String var1, IImage var2, int var3) {
      String var4 = com.aspose.slides.internal.z0k.z1.l6(this.k5(), var1);
      var2.save(var4, var3);
   }

   private String n5(IImage var1, int var2) {
      String var3 = this.u3(com.aspose.slides.ms.System.d1.u9(com.aspose.slides.ms.System.s3.n5(ImageFormat.class, var2)));
      String var4 = com.aspose.slides.internal.z0k.z1.l6(this.l6(), var3);
      String var5 = var4;
      String[] var6 = new String[]{var5};
      boolean var7 = this.n5() != null && this.n5().n5(var1, var2, var6);
      var5 = var6[0];
      if (var7) {
         if (var5 != null && !com.aspose.slides.ms.System.d1.l6(var5).isEmpty()) {
            return var5;
         } else {
            throw new InvalidOperationException("ImageSavingHandler returned true but link is null or empty.");
         }
      } else {
         this.n5(var3, var1, var2);
         return var4;
      }
   }
}
