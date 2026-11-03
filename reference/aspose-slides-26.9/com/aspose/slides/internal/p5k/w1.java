package com.aspose.slides.internal.p5k;

public class w1 {
   private static byte[] n5;
   private static final Object l6 = new Object();
   private static byte[] k5;
   private static final Object u3 = new Object();
   private static byte[] a6;
   private static final Object u9 = new Object();
   private static final byte[] h0 = new byte[]{67, 87, 83, 11, 23, 13, 33, 0};

   public static byte[] n5() {
      if (n5 == null) {
         synchronized (l6) {
            if (n5 == null) {
               com.aspose.slides.internal.z0k.t4 var1 = com.aspose.slides.internal.j7.n3.n5("/Aspose/Foundation/Resources/viewer.data");
               byte[] var2 = new byte[(int)var1.getLength()];
               var1.read(var2, 0, var2.length);
               var1.dispose();
               com.aspose.slides.internal.z0k.e2 var3 = new com.aspose.slides.internal.z0k.e2();
               var3.write(h0, 0, h0.length);
               var3.write(var2, 0, var2.length);
               var3.setPosition(0L);

               try {
                  com.aspose.slides.internal.z0k.e2 var4 = new com.aspose.slides.internal.z0k.e2();

                  try {
                     com.aspose.slides.internal.z0k.l6 var5 = new com.aspose.slides.internal.z0k.l6(var4);

                     try {
                        byte var6 = 8;
                        byte var7 = 38;
                        byte[] var8 = new byte[8];
                        var3.read(var8, 0, 8);
                        var5.n5(var8);
                        byte[] var9 = com.aspose.slides.internal.n2d.t4.n5((com.aspose.slides.internal.z0k.t4)(var3), (long)((int)(var3.getLength() - 8L)));
                        byte[] var10 = com.aspose.slides.internal.j7.t9.n5(var9, 0, 1);
                        var5.n5(var10);
                        var5.n5().setPosition(38L);
                        n5 = com.aspose.slides.internal.n2d.t4.n5((com.aspose.slides.internal.z0k.t4)(var4), (long)((int)(var4.getLength() - 42L)));
                     } finally {
                        if (var5 != null) {
                           var5.dispose();
                        }
                     }
                  } finally {
                     if (var4 != null) {
                        var4.dispose();
                     }
                  }
               } finally {
                  if (var3 != null) {
                     var3.dispose();
                  }
               }
            }
         }
      }

      return n5;
   }

   public static byte[] l6() {
      if (k5 == null) {
         synchronized (u3) {
            if (k5 == null) {
               com.aspose.slides.internal.z0k.t4 var1 = com.aspose.slides.internal.j7.n3.n5("/Aspose/Foundation/Resources/PageAbcData.bin");

               try {
                  k5 = com.aspose.slides.internal.n2d.t4.l6(var1);
               } finally {
                  if (var1 != null) {
                     var1.dispose();
                  }
               }
            }
         }
      }

      return k5;
   }

   public static byte[] k5() {
      if (a6 == null) {
         synchronized (u9) {
            if (a6 == null) {
               com.aspose.slides.internal.z0k.t4 var1 = com.aspose.slides.internal.j7.n3.n5("/Aspose/Foundation/Resources/DocumentDescriptorAbcData.bin");

               try {
                  a6 = com.aspose.slides.internal.n2d.t4.l6(var1);
               } finally {
                  if (var1 != null) {
                     var1.dispose();
                  }
               }
            }
         }
      }

      return a6;
   }
}
