package com.aspose.slides.internal.l6z;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;

public class p6 {
   public static byte[] n5(byte[] var0) {
      if (var0 == null) {
         throw new ArgumentNullException();
      }

      h0 var1 = u3(var0);
      return n5(var1);
   }

   public static byte[] l6(byte[] var0) {
      if (var0 != null && var0.length != 0) {
         h0 var1 = new h0();
         var1.n5((byte)1);
         List var2 = k5(var0);
         List$Enumerator var3 = var2.iterator();

         try {
            while (var3.hasNext()) {
               t2 var4 = (t2)var3.next();
               u3 var5 = n5(var4);
               var1.n5().addItem(var5);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }

         com.aspose.slides.internal.z0k.e2 var21 = new com.aspose.slides.internal.z0k.e2();

         try {
            com.aspose.slides.internal.z0k.l6 var22 = new com.aspose.slides.internal.z0k.l6(var21);

            try {
               var1.n5(var22);
               return var21.toArray();
            } finally {
               if (var22 != null) {
                  var22.dispose();
               }
            }
         } finally {
            if (var21 != null) {
               var21.dispose();
            }
         }
      } else {
         throw new ArgumentNullException();
      }
   }

   private static u3 n5(t2 var0) {
      List var1 = new List();
      int var2 = 0;
      int var3 = 0;

      while (var3 < var0.n5().length) {
         i9 var4 = new i9();
         var2++;

         for (int var5 = 0; var5 < 8 && var3 < var0.n5().length; var5++) {
            int[] var6 = new int[]{var3};
            j4 var7 = n5(var0.n5(), var6);
            var3 = var6[0];
            var2++;
            if (com.aspose.slides.internal.v6g.k5.l6(var7, c8.class)) {
               var4.n5((byte)(com.aspose.slides.internal.v6g.k5.u3(var4.n5(), 6) | com.aspose.slides.internal.v6g.k5.u3((byte)(1 << var5), 6)));
               var2++;
            }

            var4.l6().addItem(var7);
         }

         var1.addItem(var4);
      }

      u3 var8 = new u3();
      u9 var9 = new u9();
      var8.n5(var9);
      var9.l6((byte)1);
      var9.n5((byte)3);
      var9.n5(com.aspose.slides.internal.v6g.k5.a6(var2 - 1, 9));
      a6 var10 = new a6(var9.n5(), true);
      var8.n5(var10);
      var10.n5(var1);
      return var8;
   }

   private static j4 n5(byte[] var0, int[] var1) {
      int var2 = var1[0] - 1;
      int var3 = 0;
      int var4 = 0;

      while (var2 >= 0) {
         int var5 = var2;
         int var6 = var1[0];
         int var7 = 0;

         while (var6 < var0.length && com.aspose.slides.internal.v6g.k5.u3(var0[var6], 6) == com.aspose.slides.internal.v6g.k5.u3(var0[var5], 6)) {
            var7++;
            var5++;
            var6++;
         }

         if (var7 > var3) {
            var3 = var7;
            var4 = var2;
         }

         var2--;
      }

      if (var3 >= 3) {
         c8 var9 = new c8();
         int var10 = var9.n5(var3, var1[0] - var4, var1[0]);
         var1[0] += var10;
         return var9;
      } else {
         y4 var8 = new y4();
         var8.n5(var0[var1[0]]);
         var1[0]++;
         return var8;
      }
   }

   private static List<t2> k5(byte[] var0) {
      List var1 = new List();
      int var2 = 0;

      while (var2 < var0.length) {
         int var3 = var2 + 4096 >= var0.length ? var0.length - var2 : 4096;
         byte[] var4 = new byte[var3];
         com.aspose.slides.ms.System.y4.n5(com.aspose.slides.ms.System.u3.n5((Object)(var0)), var2, com.aspose.slides.ms.System.u3.n5((Object)(var4)), 0, var3);
         t2 var5 = new t2(var4);
         var1.addItem(var5);
         var2 += var3;
      }

      return var1;
   }

   private static byte[] n5(h0 var0) {
      if (var0.n5().size() == 0) {
         throw new InvalidOperationException();
      }

      com.aspose.slides.internal.z0k.e2 var1 = new com.aspose.slides.internal.z0k.e2();

      try {
         List$Enumerator var2 = var0.n5().iterator();

         try {
            while (var2.hasNext()) {
               u3 var3 = (u3)var2.next();
               com.aspose.slides.internal.z0k.e2 var4 = new com.aspose.slides.internal.z0k.e2();

               try {
                  com.aspose.slides.internal.z0k.l6 var5 = new com.aspose.slides.internal.z0k.l6(var4);

                  try {
                     if (com.aspose.slides.internal.v6g.k5.u3(var3.n5().l6(), 6) == 1) {
                        if (var3.l6().l6().size() == 0) {
                           throw new InvalidOperationException();
                        }

                        List$Enumerator var6 = var3.l6().l6().iterator();

                        try {
                           while (var6.hasNext()) {
                              i9 var7 = (i9)var6.next();
                              List$Enumerator var8 = var7.l6().iterator();

                              try {
                                 while (var8.hasNext()) {
                                    j4 var9 = (j4)var8.next();
                                    var9.l6(var5);
                                 }
                              } finally {
                                 if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
                                    var8.dispose();
                                 }
                              }
                           }
                        } finally {
                           if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
                              var6.dispose();
                           }
                        }
                     } else {
                        var5.n5(var3.l6().n5());
                     }
                  } finally {
                     if (var5 != null) {
                        var5.dispose();
                     }
                  }

                  byte[] var58 = var4.getBuffer();
                  var1.write(var58, 0, var58.length);
               } finally {
                  if (var4 != null) {
                     var4.dispose();
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }

         return var1.getBuffer();
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }
   }

   private static h0 u3(byte[] var0) {
      com.aspose.slides.internal.z0k.e2 var1 = new com.aspose.slides.internal.z0k.e2(var0);

      try {
         com.aspose.slides.internal.z0k.n5 var2 = new com.aspose.slides.internal.z0k.n5(var1);

         try {
            h0 var3 = new h0();
            var3.n5(var2);
            return var3;
         } finally {
            if (var2 != null) {
               var2.dispose();
            }
         }
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }
   }
}
