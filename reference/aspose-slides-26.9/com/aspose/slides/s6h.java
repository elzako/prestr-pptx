package com.aspose.slides;

class s6h {
   static Hyperlink n5(com.aspose.slides.internal.k0r.k6 var0, a9x var1) {
      if (var1 == null) {
         return Hyperlink.getNoAction();
      }

      d5f var2 = var1.y4().a6();
      com.aspose.slides.internal.k0r.t1 var3 = var2.h0();
      Hyperlink var4 = Hyperlink.getNoAction();
      com.aspose.slides.internal.k0r.q2 var5 = null;
      if (var3.z1() != null && var3.z1().u3() != null) {
         var5 = n5(var3, var0, "", false);
      }

      label104:
      switch (var0.u3()) {
         case 0:
         case 5:
         default:
            break;
         case 1:
            com.aspose.slides.internal.k0r.z1 var12 = ((com.aspose.slides.internal.k0r.o7)var0.d5()).u3();
            if (var12 != null) {
               var4 = new Hyperlink(false, var12.l6(), 13);
            }
            break;
         case 2:
            com.aspose.slides.internal.k0r.z1 var15 = ((com.aspose.slides.internal.k0r.o7)var0.d5()).u3();
            if (var15 != null) {
               var4 = new Hyperlink(true, var15.l6(), 14);
            }
            break;
         case 3:
            switch (var0.a6()) {
               case 0:
                  var4 = Hyperlink.getNoAction();
                  break label104;
               case 1:
                  var4 = Hyperlink.getNextSlide();
                  break label104;
               case 2:
                  var4 = Hyperlink.getPreviousSlide();
                  break label104;
               case 3:
                  var4 = Hyperlink.getFirstSlide();
                  break label104;
               case 4:
                  var4 = Hyperlink.getLastSlide();
                  break label104;
               case 5:
                  var4 = Hyperlink.getLastVievedSlide();
                  break label104;
               case 6:
                  var4 = Hyperlink.getEndShow();
               default:
                  break label104;
            }
         case 4:
            com.aspose.slides.internal.k0r.c5 var6 = var3.u9();
            if (var6 != null) {
               com.aspose.slides.internal.k0r.d6 var7 = var6.u9(var0.k5());
               if (var7 != null) {
                  if (var0.c8() == 7) {
                     com.aspose.slides.internal.k0r.z1 var8 = var7.u9();
                     if (var8 != null) {
                        var4 = new Hyperlink(false, com.aspose.slides.ms.System.d1.n5(new String[]{"#", var8.l6()}), 8);
                        var2.q0().addItem(var4);
                     } else if (var7.a6() != null) {
                        var4 = new Hyperlink(var7.a6().l6());
                     } else if (var7.u3() != null) {
                        var4 = new Hyperlink(false, var7.u3().l6(), 8);
                        var2.q0().addItem(var4);
                     }
                  } else {
                     String var17 = "";
                     com.aspose.slides.internal.k0r.z1 var9 = var7.a6();
                     com.aspose.slides.internal.k0r.z1 var10 = var7.u3();
                     if (var9 != null) {
                        var17 = var9.l6();
                        com.aspose.slides.internal.k0r.z1 var11 = var7.u9();
                        if (var11 != null) {
                           var17 = com.aspose.slides.ms.System.d1.n5(new String[]{var17, "#", var11.l6()});
                        }
                     } else if (var10 != null) {
                        var17 = var10.l6();
                     }

                     if (!com.aspose.slides.ms.System.d1.n5(var17)) {
                        int var18 = com.aspose.slides.ms.System.d1.u3(var17, ParagraphCollection.n5[0]);
                        if (var18 > 0 && com.aspose.slides.ms.System.d1.c8(var17, "\r\n") != var18) {
                           var17 = com.aspose.slides.ms.System.d1.n5(var17, "\r", "\r\n");
                        }

                        if (var0.c8() == 10) {
                           var4 = new Hyperlink(true, var17, 10);
                        } else if (var0.c8() == 9) {
                           var4 = new Hyperlink(true, var17, 11);
                        } else {
                           var4 = new Hyperlink(var17);
                        }

                        if (var10 != null) {
                           var4.u3().n5(var10.l6());
                        }
                     }
                  }
               }
            }
            break;
         case 6:
            var4 = Hyperlink.getMedia();
      }

      if (var5 != null) {
         com.aspose.slides.internal.k0r.z1 var13 = var5.u3();
         if (var13 != null) {
            var4.setTooltip(var13.l6());
         }
      }

      if (var0.u9()) {
         var4.setStopSoundOnClick(var0.h0());
      }

      if ((var0.l6() & 4294967295L) > 0L) {
         com.aspose.slides.internal.k0r.d0p var14 = var2.h0().s7();
         com.aspose.slides.internal.k0r.x6s var16 = var14.n5((int)var0.l6());
         if (var16 != null && var16.a6() != null && var16.u9() != null) {
            var4.setSound(var2.n5(var16));
            if (var16.l6() != null) {
               ((Audio)var4.getSound()).n5().n5(var16.l6().l6());
            }
         }
      }

      return Hyperlink.op_Equality(var4, Hyperlink.getNoAction()) && var0.c8() == -1 ? null : var4;
   }

   static com.aspose.slides.internal.k0r.o7 n5(Hyperlink var0, String var1, g6o var2) {
      if (var0 == null) {
         return null;
      }

      com.aspose.slides.internal.k0r.o7 var3 = new com.aspose.slides.internal.k0r.o7(null);
      com.aspose.slides.internal.k0r.k6 var4 = new com.aspose.slides.internal.k0r.k6();
      var3.e2().addItem(var4);
      if (var0.getSound() != null) {
         var4.n5(e0j.n5(var0.getSound(), var2) & 4294967295L);
         if (var0.getActionType() == 0) {
            var4.l6((byte)-1);
            return var3;
         }
      } else if (var0.getStopSoundOnClick()) {
         var4.l6(true);
         var4.n5(true);
         if (var0.getActionType() == 0) {
            var4.l6((byte)-1);
            return var3;
         }
      }

      if (var0.getActionType() == 12) {
         var4.n5((byte)6);
         var4.l6((byte)-1);
         return var3;
      }

      com.aspose.slides.internal.k0r.t1 var5 = var2.l6().a6().h0();
      com.aspose.slides.internal.k0r.c5 var6 = var5.h0();
      com.aspose.slides.internal.k0r.d9 var7 = var6.l6();
      long var8 = var7.l6();
      var7.n5(var8 + 1L);
      com.aspose.slides.internal.k0r.d6 var10 = new com.aspose.slides.internal.k0r.d6();
      var6.e2().addItem(var10);
      com.aspose.slides.internal.k0r.p4 var11 = new com.aspose.slides.internal.k0r.p4();
      var10.e2().addItem(var11);
      var11.n5(var8);
      var4.l6(var8);
      h4t var12 = var0.u3();
      if (!"*".equals(var0.h0()) && !Hyperlink.op_Equality(var0, Hyperlink.getNoAction())) {
         if (var0.getExternalUrlOriginal() != null) {
            if (var2.q0() != null && var2.q0().getSkipJavaScriptLinks() && var0.k5(true)) {
               var4.n5((byte)0);
               return var3;
            }

            if (var0.getActionType() == 14) {
               var4.n5((byte)2);
               var3.e2().addItem(new com.aspose.slides.internal.k0r.z1(var0.getExternalUrlOriginal(), (short)2));
            } else {
               String var13 = var0.getExternalUrlOriginal();
               if (!com.aspose.slides.ms.System.d1.n5(var1)) {
                  var10.e2().addItem(new com.aspose.slides.internal.k0r.z1(var1, (short)0));
               } else {
                  var10.e2().addItem(new com.aspose.slides.internal.k0r.z1(var13, (short)0));
               }

               if (com.aspose.slides.ms.System.d1.t2(var13, "#")) {
                  var10.e2()
                     .addItem(
                        new com.aspose.slides.internal.k0r.z1(
                           com.aspose.slides.ms.System.d1.l6(var13, 0, com.aspose.slides.ms.System.d1.k5(var13, '#')), (short)1
                        )
                     );
                  var10.e2()
                     .addItem(
                        new com.aspose.slides.internal.k0r.z1(
                           com.aspose.slides.ms.System.d1.n5(var13, 0, com.aspose.slides.ms.System.d1.k5(var13, '#') + 1), (short)3
                        )
                     );
               } else {
                  var10.e2().addItem(new com.aspose.slides.internal.k0r.z1(var13, (short)1));
               }

               var4.n5((byte)4);
               if (var0.getActionType() == 10) {
                  var4.l6((byte)10);
               } else if (var0.getActionType() == 11) {
                  var4.l6((byte)9);
               } else {
                  var4.l6((byte)8);
               }

               n5(var5, var4, var0.getTooltip(), true);
            }
         } else if (var0.u3().n5() != null) {
            if (var0.u3().n5().getPresentation() != var2.n5()) {
               var4.n5((byte)0);
            } else {
               var2.m3().addItem(var10, var0.u3().n5());
               var4.n5((byte)4);
               var4.l6((byte)7);
               n5(var5, var4, var0.getTooltip(), true);
            }
         } else if (var0.getActionType() == 4
            || var0.getActionType() == 3
            || var0.getActionType() == 2
            || var0.getActionType() == 5
            || var0.getActionType() == 7
            || var0.getActionType() == 6) {
            var4.n5((byte)3);
            var4.l6((byte)1);
            switch (var0.getActionType()) {
               case 2:
                  var10.e2().addItem(new com.aspose.slides.internal.k0r.z1("FIRST", (short)0));
                  var10.e2().addItem(new com.aspose.slides.internal.k0r.z1("-1,-1,FIRST", (short)3));
                  var4.l6((byte)2);
                  var4.n5(3);
                  break;
               case 3:
                  var10.e2().addItem(new com.aspose.slides.internal.k0r.z1("PREV", (short)0));
                  var10.e2().addItem(new com.aspose.slides.internal.k0r.z1("-1,-1,PREV", (short)3));
                  var4.l6((byte)1);
                  var4.n5(2);
                  break;
               case 4:
                  var10.e2().addItem(new com.aspose.slides.internal.k0r.z1("NEXT", (short)0));
                  var10.e2().addItem(new com.aspose.slides.internal.k0r.z1("-1,-1,NEXT", (short)3));
                  var4.l6((byte)0);
                  var4.n5(1);
                  break;
               case 5:
                  var10.e2().addItem(new com.aspose.slides.internal.k0r.z1("LAST", (short)0));
                  var10.e2().addItem(new com.aspose.slides.internal.k0r.z1("-1,-1,LAST", (short)3));
                  var4.l6((byte)3);
                  var4.n5(4);
                  break;
               case 6:
                  var10.e2().addItem(new com.aspose.slides.internal.k0r.z1("ENDSHOW", (short)0));
                  var10.e2().addItem(new com.aspose.slides.internal.k0r.z1("-1,-1,ENDSHOW", (short)3));
                  var4.n5(6);
                  break;
               case 7:
                  var10.e2().addItem(new com.aspose.slides.internal.k0r.z1("VIEWED", (short)0));
                  var10.e2().addItem(new com.aspose.slides.internal.k0r.z1("-1,-1,VIEWED", (short)3));
                  var4.n5(5);
            }

            n5(var5, var4, var0.getTooltip(), true);
         } else if (var0.getActionType() == 8 && var0.h0() != null) {
            var10.e2().addItem(new com.aspose.slides.internal.k0r.z1(var0.h0(), (short)3));
            var4.n5((byte)4);
            var4.n5(0);
            var4.l6((byte)7);
            n5(var5, var4, var0.getTooltip(), true);
         } else if (var0.getActionType() == 13) {
            var4.n5((byte)1);
            String var14 = com.aspose.slides.ms.System.d1.n5(var0.a6(), "ppaction://macro?name=", "");
            var3.e2().addItem(new com.aspose.slides.internal.k0r.z1(var14, (short)2));
         }

         return var3;
      } else {
         var4.n5((byte)0);
         return var3;
      }
   }

   static void n5(Hyperlink var0, boolean var1, String var2, com.aspose.slides.internal.k0r.d2a var3, g6o var4) {
      if (var3 != null) {
         com.aspose.slides.internal.k0r.o7 var5 = n5(var0, var2, var4);
         if (var5 != null) {
            var5.k5((short)(var1 ? 0 : 1));
            var3.n5(var5);
         }
      }
   }

   static void n5(Hyperlink var0, boolean var1, k1z var2) {
      com.aspose.slides.internal.k0r.q5 var3 = var2.z3();
      if (var3 != null) {
         com.aspose.slides.internal.k0r.o7 var4 = n5(var0, null, var2.a6().n5());
         if (var4 != null) {
            var4.k5((short)(var1 ? 0 : 1));
            var3.s7().n5(var4);
         }
      }
   }

   private static com.aspose.slides.internal.k0r.q2 n5(
      com.aspose.slides.internal.k0r.t1 var0, com.aspose.slides.internal.k0r.k6 var1, String var2, boolean var3
   ) {
      if ((var1.k5() & 4294967295L) == 0L) {
         return null;
      }

      com.aspose.slides.internal.k0r.g3 var4 = var0.z1().u3().l6();
      if (var4 != null) {
         for (com.aspose.slides.internal.k0r.q2 var8 : var4.h0()) {
            if (var8.l6().l6() == var1.k5()) {
               return var8;
            }
         }

         if (var3) {
            com.aspose.slides.internal.k0r.q2 var9 = new com.aspose.slides.internal.k0r.q2();
            var4.e2().addItem(var9);
            com.aspose.slides.internal.k0r.p4 var10 = new com.aspose.slides.internal.k0r.p4();
            var9.e2().addItem(var10);
            var10.n5(var1.k5());
            String var11 = var2;
            if (var11 == null) {
               var11 = "";
            }

            var9.n5(new com.aspose.slides.internal.k0r.z1(var11, (short)0));
            com.aspose.slides.internal.k0r.y6 var12 = new com.aspose.slides.internal.k0r.y6();
            var9.e2().addItem(var12);
            var12.n5(1L);
            return var9;
         }
      }

      return null;
   }
}
