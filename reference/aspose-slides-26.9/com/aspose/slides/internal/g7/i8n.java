package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

public class i8n extends b2 {
   @Override
   public void n5() {
      if (com.aspose.slides.internal.v6g.k5.l6(this.n5, k0y.class)) {
         k0y var1 = (k0y)this.n5;
         if (!var1.y4().l6(k3.n5)) {
            var1.y4().n5(k3.n5);
         }

         com.aspose.slides.internal.z0k.t4 var2 = this.n5.x8().k5()[0].k5().l6();
         com.aspose.slides.internal.z0k.n5 var3 = new com.aspose.slides.internal.z0k.n5(var2);

         byte[] var4;
         try {
            var4 = var3.c8((int)var2.getLength());
         } finally {
            if (var3 != null) {
               var3.dispose();
            }
         }

         com.aspose.slides.internal.z0k.e2 var5 = new com.aspose.slides.internal.z0k.e2();
         com.aspose.slides.internal.z0k.l6 var6 = new com.aspose.slides.internal.z0k.l6(this.l6);

         try {
            byte[] var7 = com.aspose.slides.internal.l7h.j5.e2().u3("currentfile eexec");
            byte[] var8 = com.aspose.slides.internal.l7h.j5.e2().u3("/CharStrings");
            byte[] var9 = com.aspose.slides.internal.l7h.j5.e2().u3("\r");
            byte[] var10 = com.aspose.slides.internal.l7h.j5.e2().u3("\n");
            byte[] var11 = com.aspose.slides.internal.l7h.j5.e2().u3("end");
            byte[] var12 = com.aspose.slides.internal.l7h.j5.e2().u3("end");
            byte[] var13 = com.aspose.slides.internal.l7h.j5.e2().u3("/");
            byte[] var14 = com.aspose.slides.internal.l7h.j5.e2().u3("-|");
            byte[] var15 = com.aspose.slides.internal.l7h.j5.e2().u3("RD");
            byte[] var16 = com.aspose.slides.internal.l7h.j5.e2().u3("|-\r");
            byte[] var17 = com.aspose.slides.internal.l7h.j5.e2().u3("|-\n");
            byte[] var18 = com.aspose.slides.internal.l7h.j5.e2().u3("ND\r");
            byte[] var19 = com.aspose.slides.internal.l7h.j5.e2().u3("ND\n");
            byte[] var20 = com.aspose.slides.internal.l7h.j5.e2().u3("0000000000000000000000000000000000000000000000000000000000000000");
            byte[] var21 = new byte[]{-128, 1};
            byte[] var22 = new byte[65535];
            int var23 = 0;
            byte[] var24 = ((c4i)var1.e2()).n5().n5();

            for (var23 = 0; var23 < var4.length; var23++) {
               var6.n5(var4[var23]);
               if (var23 != var4.length - 1 && z8.n5(var4, var23, var7)) {
                  var6.n5(var4, var23 + 1, var7.length - 1);
                  var23 += var7.length;

                  for (int var25 = 0; var25 < 2; var25++) {
                     if (z8.n5(var4, var23, var9) || z8.n5(var4, var23, var10)) {
                        var6.n5(var4[var23]);
                        var23++;
                     }
                  }

                  com.aspose.slides.internal.z0k.l6 var47 = new com.aspose.slides.internal.z0k.l6(var5);

                  try {
                     for (int var26 = 0; var26 < var24.length; var26++) {
                        if (!z8.n5(var24, var26, var8)) {
                           var47.n5(var24[var26]);
                        } else {
                           while (!z8.n5(var24, var26, var9) && !z8.n5(var24, var26, var10)) {
                              var47.n5(var24[var26]);
                              var26++;
                           }

                           for (int var27 = 0; var27 < 2; var27++) {
                              if (z8.n5(var24, var26, var9) || z8.n5(var24, var26, var10)) {
                                 var47.n5(var24[var26]);
                                 var26++;
                              }
                           }

                           while (var26 < var24.length) {
                              com.aspose.slides.internal.l7h.a5 var49 = new com.aspose.slides.internal.l7h.a5();
                              if (z8.n5(var24, var26, var11) || z8.n5(var24, var26, var12)) {
                                 var47.n5(var24, var26, var24.length - var26);
                                 var26 += var24.length - var26;
                                 break;
                              }

                              if (!z8.n5(var24, var26, var13)) {
                                 var26++;
                              } else {
                                 int var28 = 0;

                                 while (!z8.n5(var24, var26, var14) && !z8.n5(var24, var26, var15)) {
                                    var22[var28++] = var24[var26];
                                    var49.n5((char)(var24[var26] & 0xFF));
                                    var26++;
                                 }

                                 boolean var29 = n5(var49.toString(), var1.k5());

                                 while (
                                    !z8.n5(var24, var26, var16) && !z8.n5(var24, var26, var17) && !z8.n5(var24, var26, var18) && !z8.n5(var24, var26, var19)
                                 ) {
                                    if (var29) {
                                       var22[var28++] = var24[var26];
                                    }

                                    var26++;
                                 }

                                 if (var29) {
                                    var22[var28++] = var24[var26];
                                    var22[var28++] = var24[var26 + 1];
                                    var22[var28++] = var24[var26 + 2];
                                 }

                                 var26 += 3;

                                 for (int var30 = 0; var30 < 2; var30++) {
                                    if (z8.n5(var24, var26, var9) || z8.n5(var24, var26, var10)) {
                                       if (var29) {
                                          var22[var28++] = var24[var26];
                                       }

                                       var26++;
                                    }
                                 }

                                 if (var29) {
                                    var47.n5(var22, 0, var28);
                                 }
                              }
                           }
                        }
                     }
                  } finally {
                     if (var47 != null) {
                        var47.dispose();
                     }
                  }

                  var1.n5().n5(var5.toArray());
                  j6 var48 = new j6(0);
                  byte[] var50 = new byte[var1.n5().n5().length];

                  for (int var53 = 0; var53 < var1.n5().n5().length; var53++) {
                     var50[var53] = var48.l6(var1.n5().n5()[var53]);
                  }

                  var6.n5((byte)-128);
                  var6.n5((byte)2);
                  var6.n5((byte)var50.length);
                  var6.n5((byte)(var50.length >> 8));
                  var6.n5((byte)(var50.length >> 16));
                  var6.n5((byte)(var50.length >> 24));
                  var6.n5(var50);

                  while (var23 != var4.length - 1 && !z8.n5(var4, var23, var20)) {
                     var23++;
                  }

                  if (z8.n5(var4, var23 - 6, var21)) {
                     var23 -= 6;
                  }

                  var6.n5(var4, var23, var4.length - var23);
                  break;
               }
            }
         } finally {
            if (var6 != null) {
               var6.dispose();
            }
         }
      }
   }

   private static boolean n5(String var0, f1 var1) {
      IGenericEnumerator var2 = var1.iterator();

      try {
         while (var2.hasNext()) {
            String var3 = (String)var2.next();
            if (com.aspose.slides.ms.System.d1.c8(var0, var3) != -1) {
               return true;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return false;
   }
}
