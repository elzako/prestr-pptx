package com.aspose.slides.internal.v1;

import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;

public class y4 {
   public static void n5(int var0, int var1, int var2, int var3, t4 var4, t4 var5, int var6) {
      if (var0 == 1) {
         com.aspose.slides.internal.d4.l6.n5(var4, var5, var6);
      } else {
         int var7 = var1 * var2;
         int var8 = (var7 + 7) / 8;
         int var9 = (var3 * var7 + 7) / 8;
         byte[] var10 = new byte[var9];
         byte[] var11 = new byte[var9];
         int var12 = var0;
         byte[] var13 = new byte[var6];

         while (var4.getLength() - var4.getPosition() > 0L) {
            label141: {
               if (var0 >= 10) {
                  byte[] var14 = new byte[1];
                  var12 = var4.readByte();
                  if (var12 == -1) {
                     return;
                  }

                  var12 += 10;
               }

               int var15 = 0;

               int var28;
               while (var15 < var9 && (var28 = var4.read(var10, var15, var9 - var15)) > 0) {
                  var15 += var28;
               }

               int var16;
               switch (var12) {
                  case 2:
                     if (var2 == 16) {
                        byte var34 = 0;

                        while (true) {
                           if (var34 >= var9) {
                              break label141;
                           }

                           int var39 = ((var10[var34] & 255 & 0xFF) << 8) + (var10[var34 + 1] & 255 & 0xFF);
                           int var44 = var34 - var8 >= 0 ? ((var10[var34 - var8] & 255 & 0xFF) << 8) + (var10[var34 - var8 + 1] & 255 & 0xFF) : 0;
                           var10[var34] = (byte)(var39 + var44 >> 8 & 0xFF);
                           var10[var34 + 1] = (byte)(var39 + var44 & 0xFF);
                           var34 += 2;
                        }
                     }

                     if (var2 != 8) {
                        String var33 = d1.n5("TIFF-Predictor with {0} bits per component not supported", new Object[]{var2});
                        throw new IOException(var33);
                     }

                     for (int var32 = 0; var32 < var9; var32++) {
                        int var38 = var10[var32] & 255 & 0xFF;
                        int var43 = var32 - var8 >= 0 ? var10[var32 - var8] & 0xFF & 0xFF : 0;
                        var10[var32] = (byte)(var38 + var43);
                     }
                  case 3:
                  case 4:
                  case 5:
                  case 6:
                  case 7:
                  case 8:
                  case 9:
                  case 10:
                  default:
                     break label141;
                  case 11:
                     var16 = 0;

                     while (true) {
                        if (var16 >= var9) {
                           break label141;
                        }

                        int var37 = var10[var16] & 255;
                        int var42 = (var16 - var8 >= 0 ? var10[var16 - var8] : 0) & 255;
                        var10[var16] = (byte)(var37 + var42);
                        var16++;
                     }
                  case 12:
                     var16 = 0;

                     while (true) {
                        if (var16 >= var9) {
                           break label141;
                        }

                        int var36 = var10[var16] & 255 & 0xFF;
                        int var41 = var11[var16] & 255 & 0xFF;
                        var10[var16] = (byte)(var36 + var41 & 0xFF);
                        var16++;
                     }
                  case 13:
                     var16 = 0;

                     while (true) {
                        if (var16 >= var9) {
                           break label141;
                        }

                        int var35 = var10[var16] & 255 & 0xFF;
                        int var40 = var16 - var8 >= 0 ? var10[var16 - var8] & 0xFF & 0xFF : 0;
                        int var45 = var11[var16] & 255 & 0xFF;
                        double var20 = (var40 + var45) / 2;
                        var10[var16] = (byte)(var35 + com.aspose.slides.internal.v6g.k5.u3(q1.k5(var20), 14) & 0xFF);
                        var16++;
                     }
                  case 14:
                     var16 = 0;
               }

               for (; var16 < var9; var16++) {
                  int var17 = var10[var16] & 255 & 0xFF;
                  int var18 = var16 - var8 >= 0 ? var10[var16 - var8] & 0xFF & 0xFF : 0;
                  int var19 = var11[var16] & 255 & 0xFF;
                  int var22 = var16 - var8 >= 0 ? var11[var16 - var8] & 0xFF & 0xFF : 0;
                  int var23 = var18 + var19 - var22;
                  int var24 = q1.n5(var23 - var18);
                  int var25 = q1.n5(var23 - var19);
                  int var26 = q1.n5(var23 - var22);
                  if (var24 <= var25 && var24 <= var26) {
                     var10[var16] = (byte)(var17 + var18 & 0xFF);
                  } else if (var25 <= var26) {
                     var10[var16] = (byte)(var17 + var19 & 0xFF);
                  } else {
                     var10[var16] = (byte)(var17 + var22 & 0xFF);
                  }
               }
            }

            com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var10)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var11)), 0, var9);
            var5.write(var10, 0, var10.length);
         }
      }
   }
}
