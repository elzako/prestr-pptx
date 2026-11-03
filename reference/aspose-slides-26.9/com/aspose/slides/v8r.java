package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class v8r extends w6n {
   static void l6(v5s var0) {
      u3(var0);
      GeometryShape var1 = com.aspose.slides.internal.v6g.k5.n5(var0.a6().m1(), GeometryShape.class);
      com.aspose.slides.internal.k0r.r3 var2 = var0.k5().a6();
      if (var2 != null) {
         com.aspose.slides.internal.k0r.z5 var3 = com.aspose.slides.internal.v6g.k5.n5(var2.l6().n5(772), com.aspose.slides.internal.k0r.z5.class);
         if (var3 != null) {
            var1.setBlackWhiteMode((byte)var3.j5());
         }
      }
   }

   static void n5(j2x var0, AutoShapeImp var1, com.aspose.slides.internal.k0r.q5 var2) {
      new w8e(var0, var1, var2.a6());
      if (var1.n5() != null) {
         for (int var4 = 0; var4 < var1.n5().length; var4++) {
            var0.l6()[var4] = new y2(
               com.aspose.slides.ms.System.d1.n5(new String[]{"adj", com.aspose.slides.ms.System.a3.l6(var4)}),
               com.aspose.slides.internal.v6g.k5.u9(var1.n5()[var4] * 1000 / 216.0, 14)
            );
         }
      }
   }

   static void n5(k1z var0) {
      GeometryShape var1 = com.aspose.slides.internal.v6g.k5.n5(var0.s7(), GeometryShape.class);
      if (var1 != null) {
         com.aspose.slides.internal.k0r.r3 var2 = var0.z8();
         com.aspose.slides.internal.k0r.f5 var3 = (com.aspose.slides.internal.k0r.f5)var2.l6().n5(383);
         if (var3 == null) {
            var2.l6().n5(var3 = new com.aspose.slides.internal.k0r.f5());
         }

         if (n5(var1.getShapeType(), false) == 0) {
            com.aspose.slides.internal.k0r.z5 var4 = new com.aspose.slides.internal.k0r.z5(320, 0L);
            var2.l6().l6(var4);
            com.aspose.slides.internal.k0r.z5 var5 = new com.aspose.slides.internal.k0r.z5(321, 0L);
            var2.l6().l6(var5);
            com.aspose.slides.internal.k0r.z5 var6 = new com.aspose.slides.internal.k0r.z5(322, 21600L);
            var2.l6().l6(var6);
            com.aspose.slides.internal.k0r.z5 var7 = new com.aspose.slides.internal.k0r.z5(323, 21600L);
            var2.l6().l6(var7);
            com.aspose.slides.internal.k0r.z5 var8 = new com.aspose.slides.internal.k0r.z5(324, 4L);
            var2.l6().l6(var8);
            byte[] var9 = null;
            double[] var10 = null;
            byte[][] var11 = new byte[][]{var9};
            double[][] var12 = new double[][]{var10};
            var1.e2().n5(var1.getFrame().getWidth() * 21600.0F, var1.getFrame().getHeight() * 21600.0F, var11, var12);
            var9 = var11[0];
            var10 = var12[0];
            u3k var13 = var1.e2().n5();
            if (var13.c8() != 0) {
               var13 = var13.t2();
            }

            q7g[] var14 = var13.a6();
            int var15 = 0;
            int var16 = 0;
            int var17 = 0;
            int var18 = 0;
            List var19 = new List();
            List var20 = new List();
            if (var14 != null) {
               com.aspose.slides.internal.k0r.w5 var21 = new com.aspose.slides.internal.k0r.w5(0, 0);

               for (int var22 = 0; var22 < var14.length; var22++) {
                  q7g var23 = var14[var22];
                  if (var23.l6() > var15) {
                     var15 = (int)var23.l6();
                  }

                  if (var23.k5() > var16) {
                     var16 = (int)var23.k5();
                  }

                  long[] var24 = var23.n5();
                  boolean var25 = false;
                  boolean var26 = false;
                  byte var27 = 0;

                  for (int var28 = 0; var28 < var23.h0().length; var28++) {
                     byte var29 = var23.h0()[var28];
                     if (!var25 && var23.a6() == 0 && var29 != 1 && var29 != 0) {
                        var20.addItem(new com.aspose.slides.internal.k0r.k8(5, 10, (byte)0));
                        var25 = true;
                     }

                     if (!var26 && !var23.u9() && var29 != 1 && var29 != 0) {
                        var20.addItem(new com.aspose.slides.internal.k0r.k8(5, 11, (byte)0));
                        var26 = true;
                     }

                     switch (var29) {
                        case 0:
                           var20.addItem(new com.aspose.slides.internal.k0r.b5(3, (byte)1));
                           break;
                        case 1:
                           int var30 = com.aspose.slides.internal.v6g.k5.u3(var13.n5(var10, var9, var24[var27]), 13);
                           int var31 = com.aspose.slides.internal.v6g.k5.u3(var13.n5(var10, var9, var24[var27 + 1]), 13);
                           var27 += 2;
                           var20.addItem(new com.aspose.slides.internal.k0r.b5(2, (byte)0));
                           var21 = new com.aspose.slides.internal.k0r.w5(var30, var31);
                           var19.addItem(var21);
                           if (var21.n5() > var15) {
                              var15 = var21.n5();
                           }

                           if (var21.l6() > var16) {
                              var16 = var21.l6();
                           }
                           break;
                        case 2:
                           int var32 = com.aspose.slides.internal.v6g.k5.u3(var13.n5(var10, var9, var24[var27]), 13);
                           int var33 = com.aspose.slides.internal.v6g.k5.u3(var13.n5(var10, var9, var24[var27 + 1]), 13);
                           var27 += 2;
                           var20.addItem(new com.aspose.slides.internal.k0r.b5(0, (byte)1));
                           var21 = new com.aspose.slides.internal.k0r.w5(var32, var33);
                           var19.addItem(var21);
                           if (var21.n5() > var15) {
                              var15 = var21.n5();
                           }

                           if (var21.l6() > var16) {
                              var16 = var21.l6();
                           }
                           break;
                        case 3:
                           float var34 = var13.n5(var10, var9, var24[var27]);
                           float var35 = var13.n5(var10, var9, var24[var27 + 1]);
                           float var36 = var13.n5(var10, var9, var24[var27 + 2]) / 60000.0F;
                           float var37 = var13.n5(var10, var9, var24[var27 + 3]) / 60000.0F;
                           float var38 = var36 + var37;
                           var27 += 4;
                           if (var34 == 0.0F) {
                              var34 = 1.0E-5F;
                           }

                           if (var35 == 0.0F) {
                              var35 = 1.0E-5F;
                           }

                           double var39 = com.aspose.slides.ms.System.q1.c8(var36 * Math.PI / 180.0);
                           double var41 = com.aspose.slides.ms.System.q1.h0(var36 * Math.PI / 180.0);
                           double var43 = com.aspose.slides.ms.System.q1.z3(1.0 / (var39 * var39 / var34 / var34 + var41 * var41 / var35 / var35));
                           float var45 = (float)(var21.n5() - var39 * var43 - var34);
                           float var46 = (float)(var21.l6() - var41 * var43 - var35);
                           if (var37 == 0.0F) {
                              break;
                           }

                           com.aspose.slides.internal.x4g.s7 var69 = new com.aspose.slides.internal.x4g.s7();
                           var69.n5(var45, var46, var34 * 2.0F, var35 * 2.0F, var36, var37);
                           com.aspose.slides.internal.o9b.w1[] var70 = var69.a6();
                           int var71 = (var70.length - 1) / 3;

                           for (int var72 = 0; var72 < var71 * 3; var72 += 3) {
                              var20.addItem(new com.aspose.slides.internal.k0r.b5(1, (byte)1));
                              var19.addItem(
                                 new com.aspose.slides.internal.k0r.w5(
                                    com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var70[1 + var72].l6()), 14),
                                    com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var70[1 + var72].k5()), 14)
                                 )
                              );
                              var19.addItem(
                                 new com.aspose.slides.internal.k0r.w5(
                                    com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var70[2 + var72].l6()), 14),
                                    com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var70[2 + var72].k5()), 14)
                                 )
                              );
                              var21 = new com.aspose.slides.internal.k0r.w5(
                                 com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var70[3 + var72].l6()), 14),
                                 com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var70[3 + var72].k5()), 14)
                              );
                              var19.addItem(var21);
                           }

                           if (var21.n5() > var15) {
                              var15 = var21.n5();
                           }

                           if (var21.l6() > var16) {
                              var16 = var21.l6();
                           }
                           break;
                        case 4:
                           int var47 = com.aspose.slides.internal.v6g.k5.u3(var13.n5(var10, var9, var24[var27]), 13);
                           int var48 = com.aspose.slides.internal.v6g.k5.u3(var13.n5(var10, var9, var24[var27 + 1]), 13);
                           int var49 = com.aspose.slides.internal.v6g.k5.u3(var13.n5(var10, var9, var24[var27 + 2]), 13);
                           int var50 = com.aspose.slides.internal.v6g.k5.u3(var13.n5(var10, var9, var24[var27 + 3]), 13);
                           var27 += 4;
                           var20.addItem(new com.aspose.slides.internal.k0r.k8(5, 9, (byte)1));
                           var19.addItem(new com.aspose.slides.internal.k0r.w5(var47, var48));
                           var20.addItem(new com.aspose.slides.internal.k0r.b5(0, (byte)1));
                           var21 = new com.aspose.slides.internal.k0r.w5(var49, var50);
                           var19.addItem(var21);
                           if (var21.n5() > var15) {
                              var15 = var21.n5();
                           }

                           if (var21.l6() > var16) {
                              var16 = var21.l6();
                           }
                           break;
                        case 5:
                           int var51 = com.aspose.slides.internal.v6g.k5.u3(var13.n5(var10, var9, var24[var27]), 13);
                           int var52 = com.aspose.slides.internal.v6g.k5.u3(var13.n5(var10, var9, var24[var27 + 1]), 13);
                           int var53 = com.aspose.slides.internal.v6g.k5.u3(var13.n5(var10, var9, var24[var27 + 2]), 13);
                           int var54 = com.aspose.slides.internal.v6g.k5.u3(var13.n5(var10, var9, var24[var27 + 3]), 13);
                           int var55 = com.aspose.slides.internal.v6g.k5.u3(var13.n5(var10, var9, var24[var27 + 4]), 13);
                           int var56 = com.aspose.slides.internal.v6g.k5.u3(var13.n5(var10, var9, var24[var27 + 5]), 13);
                           var27 += 6;
                           var20.addItem(new com.aspose.slides.internal.k0r.b5(1, (byte)1));
                           var19.addItem(new com.aspose.slides.internal.k0r.w5(var51, var52));
                           var19.addItem(new com.aspose.slides.internal.k0r.w5(var53, var54));
                           var21 = new com.aspose.slides.internal.k0r.w5(var55, var56);
                           var19.addItem(var21);
                           if (var21.n5() > var15) {
                              var15 = var21.n5();
                           }

                           if (var21.l6() > var16) {
                              var16 = var21.l6();
                           }
                     }
                  }

                  var20.addItem(new com.aspose.slides.internal.k0r.b5(4, (byte)0));
                  if (var23.l6() > var17) {
                     var17 = (int)var23.l6();
                  }

                  if (var23.k5() > var18) {
                     var18 = (int)var23.k5();
                  }
               }
            }

            if (var1.e2().n5().c8() != 0) {
               if (var17 > 0) {
                  var2.l6().l6(new com.aspose.slides.internal.k0r.z5(322, false, var17 & 4294967295L));
               } else {
                  var2.l6().l6(new com.aspose.slides.internal.k0r.z5(322, false, com.aspose.slides.internal.v6g.k5.a6(var1.getWidth() * 21600.0F, 13)));
               }

               if (var18 > 0) {
                  var2.l6().l6(new com.aspose.slides.internal.k0r.z5(323, false, var18 & 4294967295L));
               } else {
                  var2.l6().l6(new com.aspose.slides.internal.k0r.z5(323, false, com.aspose.slides.internal.v6g.k5.a6(var1.getHeight() * 21600.0F, 13)));
               }
            } else {
               if (var15 != 0) {
                  var2.l6().l6(new com.aspose.slides.internal.k0r.z5(322, false, var15 & 4294967295L));
               }

               if (var16 != 0) {
                  if (var1.getShapeType() == 89) {
                     var16 *= 2;
                  }

                  var2.l6().l6(new com.aspose.slides.internal.k0r.z5(323, false, var16 & 4294967295L));
               }
            }

            if (var19.size() > 0) {
               com.aspose.slides.internal.k0r.b2 var65 = new com.aspose.slides.internal.k0r.b2(325, var19.size() & 65535, 8);
               var2.l6().l6(var65);

               for (int var67 = 0; var67 < var19.size(); var67++) {
                  var65.n5(var67, ((com.aspose.slides.internal.k0r.w5)var19.get_Item(var67)).k5());
               }
            }

            if (var20.size() > 0) {
               if (((com.aspose.slides.internal.k0r.b5)var20.get_Item(var20.size() - 1)).u3() != 4) {
                  var20.addItem(new com.aspose.slides.internal.k0r.b5(4, (byte)0));
               }

               com.aspose.slides.internal.k0r.b2 var66 = new com.aspose.slides.internal.k0r.b2(326, var20.size() & 65535, 2);
               var2.l6().l6(var66);

               for (int var68 = 0; var68 < var20.size(); var68++) {
                  var66.n5(var68, com.aspose.slides.internal.v6g.k5.h0(((com.aspose.slides.internal.k0r.b5)var20.get_Item(var68)).l6(), 8));
               }
            }
         }

         e4c var57 = var1.z7().u9();
         int[] var58 = s1f.n5(var1.e2().l6(), var1.e2().x8(), (float)var57.n5, (float)var57.l6);

         for (int var59 = 0; var59 < var58.length; var59++) {
            com.aspose.slides.internal.k0r.z5 var61 = new com.aspose.slides.internal.k0r.z5(327 + var59, var58[var59] & 4294967295L);
            var2.l6().l6(var61);
         }

         if ((var3.j5() & 4294967295L) == 0L) {
            var2.l6().k5(383);
         }

         byte var60 = var1.getBlackWhiteMode();
         if (var60 != -1) {
            com.aspose.slides.internal.k0r.z5 var62 = new com.aspose.slides.internal.k0r.z5(772, var60 & 4294967295L);
            var2.l6().l6(var62);
         }
      }
   }

   static void l6(k1z var0) {
      Shape var1 = var0.s7();
      com.aspose.slides.internal.k0r.p1 var2 = var0.m3();
      boolean var3 = com.aspose.slides.internal.v6g.k5.n5(var1, PictureFrame.class) != null;
      var3 |= com.aspose.slides.internal.v6g.k5.n5(var1, OleObjectFrame.class) != null;
      var3 |= com.aspose.slides.internal.v6g.k5.n5(var1, SmartArt.class) != null;
      var3 |= com.aspose.slides.internal.v6g.k5.n5(var1, Ink.class) != null;
      if (var3) {
         var2.n5(75);
         var2.n3(true);
      } else {
         GeometryShape var10 = com.aspose.slides.internal.v6g.k5.n5(var1, GeometryShape.class);
         if (var10 != null) {
            boolean var4 = var10.getShapeType() == -1 && var1.k7().x8() != null;
            if (var4) {
               var2.n5(var1.k7().x8().t2());
               var2.n3(var1.k7().x8().c8());
            } else {
               AutoShape var5 = com.aspose.slides.internal.v6g.k5.n5(var10, AutoShape.class);
               int var6 = n5(var10.getShapeType(), var5 != null && var5.isTextBox());
               if (var6 != 0) {
                  var2.n5(var6);
                  var2.n3(var10.getShapeType() != -1);
               } else {
                  var2.n3(false);
               }
            }
         }
      }
   }

   private static int n5(int var0, boolean var1) {
      short var2 = 0;
      switch (var0) {
         case -1:
            var2 = 1;
         case 0:
         case 2:
         case 8:
         case 9:
         case 12:
         case 14:
         case 15:
         case 18:
         case 19:
         case 21:
         case 22:
         case 27:
         case 28:
         case 29:
         case 30:
         case 31:
         case 32:
         case 33:
         case 36:
         case 39:
         case 40:
         case 41:
         case 42:
         case 43:
         case 48:
         case 50:
         case 53:
         case 54:
         case 55:
         case 62:
         case 63:
         case 64:
         case 65:
         case 66:
         case 67:
         case 72:
         case 76:
         case 84:
         case 85:
         case 86:
         case 87:
         case 88:
         case 89:
         case 121:
         case 126:
         case 143:
         case 148:
         case 173:
         case 174:
         case 175:
         case 176:
         case 177:
         case 178:
         case 179:
         case 180:
         case 181:
         case 182:
         case 183:
         case 184:
         case 185:
         case 186:
         case 187:
         default:
            break;
         case 1:
            var2 = 20;
            break;
         case 3:
            var2 = 5;
            break;
         case 4:
            var2 = 6;
            break;
         case 5:
            var2 = (short)(var1 ? 202 : 1);
            break;
         case 6:
            var2 = 4;
            break;
         case 7:
            var2 = 7;
            break;
         case 10:
            var2 = 56;
            break;
         case 11:
            var2 = 9;
            break;
         case 13:
            var2 = 10;
            break;
         case 16:
            var2 = 187;
            break;
         case 17:
            var2 = 12;
            break;
         case 20:
            var2 = 58;
            break;
         case 23:
            var2 = 59;
            break;
         case 24:
            var2 = 92;
            break;
         case 25:
            var2 = 60;
            break;
         case 26:
            var2 = 2;
            break;
         case 34:
            var2 = 21;
            break;
         case 35:
            var2 = 3;
            break;
         case 37:
            var2 = 15;
            break;
         case 38:
            var2 = 55;
            break;
         case 44:
            var2 = 13;
            break;
         case 45:
            var2 = 66;
            break;
         case 46:
            var2 = 68;
            break;
         case 47:
            var2 = 67;
            break;
         case 49:
            var2 = 94;
            break;
         case 51:
            var2 = 69;
            break;
         case 52:
            var2 = 70;
            break;
         case 56:
            var2 = 77;
            break;
         case 57:
            var2 = 78;
            break;
         case 58:
            var2 = 79;
            break;
         case 59:
            var2 = 80;
            break;
         case 60:
            var2 = 81;
            break;
         case 61:
            var2 = 82;
            break;
         case 68:
            var2 = 102;
            break;
         case 69:
            var2 = 103;
            break;
         case 70:
            var2 = 104;
            break;
         case 71:
            var2 = 105;
            break;
         case 73:
            var2 = 16;
            break;
         case 74:
            var2 = 22;
            break;
         case 75:
            var2 = 73;
            break;
         case 77:
            var2 = 183;
            break;
         case 78:
            var2 = 184;
            break;
         case 79:
            var2 = 96;
            break;
         case 80:
            var2 = 71;
            break;
         case 81:
            var2 = 72;
            break;
         case 82:
            var2 = 65;
            break;
         case 83:
            var2 = 84;
            break;
         case 90:
            var2 = 85;
            break;
         case 91:
            var2 = 86;
            break;
         case 92:
            var2 = 87;
            break;
         case 93:
            var2 = 88;
            break;
         case 94:
            var2 = 185;
            break;
         case 95:
            var2 = 186;
            break;
         case 96:
            var2 = 32;
            break;
         case 97:
            var2 = 33;
            break;
         case 98:
            var2 = 34;
            break;
         case 99:
            var2 = 35;
            break;
         case 100:
            var2 = 36;
            break;
         case 101:
            var2 = 37;
            break;
         case 102:
            var2 = 38;
            break;
         case 103:
            var2 = 39;
            break;
         case 104:
            var2 = 40;
            break;
         case 105:
            var2 = 41;
            break;
         case 106:
            var2 = 42;
            break;
         case 107:
            var2 = 43;
            break;
         case 108:
            var2 = 44;
            break;
         case 109:
            var2 = 45;
            break;
         case 110:
            var2 = 52;
            break;
         case 111:
            var2 = 47;
            break;
         case 112:
            var2 = 48;
            break;
         case 113:
            var2 = 49;
            break;
         case 114:
            var2 = 50;
            break;
         case 115:
            var2 = 51;
            break;
         case 116:
            var2 = 52;
            break;
         case 117:
            var2 = 61;
            break;
         case 118:
            var2 = 62;
            break;
         case 119:
            var2 = 63;
            break;
         case 120:
            var2 = 106;
            break;
         case 122:
            var2 = 53;
            break;
         case 123:
            var2 = 54;
            break;
         case 124:
            var2 = 107;
            break;
         case 125:
            var2 = 108;
            break;
         case 127:
            var2 = 97;
            break;
         case 128:
            var2 = 98;
            break;
         case 129:
            var2 = 64;
            break;
         case 130:
            var2 = 188;
            break;
         case 131:
            var2 = 11;
            break;
         case 132:
            var2 = 109;
            break;
         case 133:
            var2 = 110;
            break;
         case 134:
            var2 = 111;
            break;
         case 135:
            var2 = 112;
            break;
         case 136:
            var2 = 113;
            break;
         case 137:
            var2 = 114;
            break;
         case 138:
            var2 = 115;
            break;
         case 139:
            var2 = 116;
            break;
         case 140:
            var2 = 117;
            break;
         case 141:
            var2 = 118;
            break;
         case 142:
            var2 = 119;
            break;
         case 144:
            var2 = 121;
            break;
         case 145:
            var2 = 122;
            break;
         case 146:
            var2 = 123;
            break;
         case 147:
            var2 = 124;
            break;
         case 149:
            var2 = 126;
            break;
         case 150:
            var2 = 127;
            break;
         case 151:
            var2 = 128;
            break;
         case 152:
            var2 = 129;
            break;
         case 153:
            var2 = 130;
            break;
         case 154:
            var2 = 131;
            break;
         case 155:
            var2 = 132;
            break;
         case 156:
            var2 = 133;
            break;
         case 157:
            var2 = 134;
            break;
         case 158:
            var2 = 135;
            break;
         case 159:
            var2 = 176;
            break;
         case 160:
            var2 = 177;
            break;
         case 161:
            var2 = 189;
            break;
         case 162:
            var2 = 190;
            break;
         case 163:
            var2 = 191;
            break;
         case 164:
            var2 = 192;
            break;
         case 165:
            var2 = 193;
            break;
         case 166:
            var2 = 194;
            break;
         case 167:
            var2 = 195;
            break;
         case 168:
            var2 = 196;
            break;
         case 169:
            var2 = 197;
            break;
         case 170:
            var2 = 198;
            break;
         case 171:
            var2 = 199;
            break;
         case 172:
            var2 = 200;
      }

      return var2;
   }
}
