package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.ms.System.IDisposable;

class v0q {
   static void n5(v5s var0) {
      byte[] var1 = var0.u3().a6().c4();
      y2p var2 = var0.a6().q0();
      if (var2 != null) {
         Shape var3 = com.aspose.slides.internal.v6g.k5.n5(var0.a6().m1(), Shape.class);
         if (var3 == null) {
            throw new NullReferenceException("No target shape for placeholder!");
         }

         int var4 = var2.k5();
         if (var4 != 0) {
            byte var5 = 0;
            byte var6 = 0;
            byte[] var7 = new byte[]{0};
            byte[] var8 = new byte[]{0};
            s1f.n5(var4, var7, var8);
            var5 = var7[0];
            var6 = var8[0];
            if (var2.n5() == 1) {
               IGenericDictionary var9 = var0.u3().s3();
               if (var9 != null && var9.containsKey(var5)) {
                  var2.n5(((Placeholder)var9.get_Item(var5)).getIndex());
               }
            }

            v5s var13 = var0.x8();
            if (var13 != null && var13.a6().q0() != null) {
               Placeholder var10 = n5(var0, var13);
               if (var10 != null) {
                  var2.n5(var10.getIndex());
               } else {
                  var2.n5(var13.a6().q0().l6());
               }
            }

            if (var1.length >= 21 && ((var1[10] & 255) == 100 || (var1[10] & 255) == 3)) {
               var3.n5(var6, var2.u3(), var5, var2.l6(), false);
            }
         }
      }
   }

   private static Placeholder n5(v5s var0, v5s var1) {
      if (var0.u3().n3() != 4) {
         return null;
      }

      com.aspose.slides.internal.k0r.g8v var2 = var0.k5().s7().z1();
      if (var2 == null) {
         return null;
      }

      y2p var3 = var0.a6().q0();
      if (var3 == null) {
         return null;
      }

      if (var1 != null) {
         MasterSlide var4 = com.aspose.slides.internal.v6g.k5.n5(var1.u3().y4(), MasterSlide.class);
         if (var4 == null) {
            return null;
         }
      }

      LayoutSlide var13 = ((Slide)var0.u3().y4()).w1();
      List var5 = t2s.l6(var13);
      List$Enumerator var6 = var5.iterator();

      try {
         while (var6.hasNext()) {
            Shape var7 = (Shape)var6.next();
            Placeholder var8 = com.aspose.slides.internal.v6g.k5.n5(var7.getPlaceholder(), Placeholder.class);
            if (var8 != null && var7.v4() == var2.l6()) {
               return var8;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }

      return null;
   }

   static void n5(k1z var0) {
      byte[] var1 = var0.a6().n5().f0();
      z4m var2 = var0.k7();
      if (var2 != null) {
         if (!var0.a6().m3()) {
            l6(var0);
            k5(var0);
            if (var0.h0()) {
               if (var1.length >= 21 && ((var1[10] & 255) == 100 || (var1[10] & 255) == 3)) {
                  l6(var2);
                  if (var2.u3() == 0) {
                     Shape var3 = var0.s7();
                     AutoShape var4 = com.aspose.slides.internal.v6g.k5.n5(var3, AutoShape.class);
                     Placeholder var5 = (Placeholder)var3.getPlaceholder();
                     var2.n5(0);
                     if (var0.a6().k7()) {
                        com.aspose.slides.internal.k0r.i8 var6 = null;
                        switch (var0.a6().k5()) {
                           case 0:
                           case 2:
                           case 3:
                              var6 = var0.a6().n5().h0().t4();
                              var2.l6(s1f.n5(var5.getType()));
                           case 1:
                           case 4:
                           default:
                              break;
                           case 5:
                           case 7:
                              var6 = var0.a6().n5().h0().q0();
                              var2.l6(s1f.l6(var5.getType()));
                              break;
                           case 6:
                              var2.l6(s1f.k5(var5.getType()));
                        }

                        if (n5(var5)) {
                           TextFrame var7 = new TextFrame(var4);
                           if (var4 != null && var4.getTextFrame() != null) {
                              var7.n5((ITextFrame)((TextFrame)var4.getTextFrame()));
                           }

                           var0.n5(var7, com.aspose.slides.internal.k0r.y3.n5(var2.a6(), var2.h0()));
                           if (var7.getParagraphs().getCount() > 0
                              && var7.getParagraphs().get_Item(0).getPortions().getCount() > 0
                              && var7.getParagraphs().get_Item(0).getPortions().get_Item(0).getField() != null) {
                              IPortion var8 = var7.getParagraphs().get_Item(0).getPortions().get_Item(0);
                              com.aspose.slides.internal.k0r.r5w var9 = var0.m1().u3().l6();
                              com.aspose.slides.internal.k0r.r6a var10 = null;
                              switch (var5.getType()) {
                                 case 4:
                                    var10 = new com.aspose.slides.internal.k0r.f8(var9);
                                    if (var6 != null) {
                                       var6.l6()
                                          .n5(
                                             (short)(
                                                s1f.n5(var8.getField().getType().getInternalString(), f8b.n5(var8.getPortionFormat().getLanguageId()).k5())
                                                   & 0xFF
                                             )
                                          );
                                    }
                                    break;
                                 case 5:
                                    var10 = new com.aspose.slides.internal.k0r.u0a(var9);
                                    break;
                                 case 6:
                                    var10 = new com.aspose.slides.internal.k0r.z9(var9);
                                    break;
                                 case 7:
                                    var10 = new com.aspose.slides.internal.k0r.b4(var9);
                                    break;
                                 default:
                                    com.aspose.slides.internal.f8y.n5.n5("");
                              }

                              if (var10 != null) {
                                 if (com.aspose.slides.ms.System.d1.n5(var8.getText())) {
                                    var8.setText("*");
                                 }

                                 var9.n5().n5(var10);
                              }
                           }
                        } else if (var4 != null) {
                           var0.n5(var4.getTextFrame(), com.aspose.slides.internal.k0r.y3.n5(var2.a6(), var2.h0()));
                        }
                     } else if (com.aspose.slides.internal.v6g.k5.l6(var3.getSlide(), ISlide.class)) {
                        var2.l6(s1f.n5(var3.getPlaceholder().getType(), var3.getPlaceholder().getOrientation()));
                        int var11 = com.aspose.slides.internal.k0r.y3.n5(var2.a6(), var2.h0());
                        n5(var11, var0);
                     } else if (com.aspose.slides.internal.v6g.k5.l6(var3.getSlide(), INotesSlide.class)
                        || com.aspose.slides.internal.v6g.k5.l6(var3.getSlide(), IMasterNotesSlide.class)) {
                        int var12 = s1f.k5(var3.getPlaceholder().getType());
                        if (var12 != 0) {
                           var2.l6(var12);
                           if (var4 != null && var4.getTextFrame() != null && !com.aspose.slides.ms.System.d1.n5(var4.getTextFrame().getText())) {
                              var0.n5(var4.getTextFrame(), com.aspose.slides.internal.k0r.y3.n5(var2.a6(), var2.h0()));
                           }
                        } else {
                           var0.n5(false);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   static void n5(z4m var0) {
      com.aspose.slides.internal.k0r.r3 var1 = var0.l6().z8();
      com.aspose.slides.internal.k0r.a7 var2 = com.aspose.slides.internal.v6g.k5.n5(var1.l6().n5(511), com.aspose.slides.internal.k0r.a7.class);
      if (var2 == null) {
         var1.l6().n5(var2 = new com.aspose.slides.internal.k0r.a7());
      }

      var2.n3(false);
      if (var0.a6() != 13) {
         var2.n3(true);
      }
   }

   private static void l6(k1z var0) {
      if (var0.a6().k5() == 6) {
         MasterNotesSlide var1 = com.aspose.slides.internal.v6g.k5.n5(
            var0.a6().n5().n5().getMasterNotesSlideManager().getMasterNotesSlide(), MasterNotesSlide.class
         );
         if (var1 != null) {
            com.aspose.slides.internal.k4y.c1v var2 = var1.t4().c8();
            if (var2 != null) {
               switch (var0.s7().getPlaceholder().getType()) {
                  case 4:
                     var0.n5(var0.h0() & !var2.u3());
                     break;
                  case 5:
                     var0.n5(var0.h0() & !var2.n5());
                     break;
                  case 6:
                     var0.n5(var0.h0() & !var2.k5());
                     break;
                  case 7:
                     var0.n5(var0.h0() & !var2.l6());
               }
            }
         }
      }
   }

   private static void k5(k1z var0) {
      y2q var1 = var0.a6();
      if (n5(var1)) {
         Shape var2 = var0.s7();
         boolean var3 = true;
         switch (var2.getPlaceholder().getType()) {
            case 4:
               com.aspose.slides.internal.k0r.i8 var8 = ((com.aspose.slides.internal.k0r.o8)var1.u3()).t4();
               var8.l6().n5(true);
               boolean var5 = !((AutoShape)var2).k5();
               var8.l6().a6(var5);
               if (var5) {
                  var8.n5(((TextFrame)((AutoShape)var2).getTextFrame()).t2());
               } else {
                  IPortion var6 = ((AutoShape)var2).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0);
                  var8.l6().n5((short)(s1f.n5(var6.getField().getType().getInternalString(), f8b.n5(var6.getPortionFormat().getLanguageId()).k5()) & 0xFF));
               }
               break;
            case 5:
               com.aspose.slides.internal.k0r.i8 var7 = ((com.aspose.slides.internal.k0r.o8)var1.u3()).t4();
               var7.l6().l6(true);
               break;
            case 6:
               com.aspose.slides.internal.k0r.i8 var4 = ((com.aspose.slides.internal.k0r.o8)var1.u3()).t4();
               var4.l6().u3(true);
               var4.k5(((TextFrame)((AutoShape)var2).getTextFrame()).t2());
               break;
            default:
               var3 = false;
         }

         if (var3) {
            var0.n5(false);
         }
      }
   }

   private static boolean n5(y2q var0) {
      Slide var1 = com.aspose.slides.internal.v6g.k5.n5(var0.l6(), Slide.class);
      if (var1 == null) {
         return false;
      } else if (var0.y2().l6()) {
         return var0.y2().n5();
      } else if (var0.n5().h0().a6().s7() && var1.w1().getLayoutType() == 0) {
         var0.n5(new com.aspose.slides.ms.System.o5<>(false));
         return false;
      } else if (!var0.n5().e5() && !var0.n5().p8()) {
         AutoShape var2 = com.aspose.slides.internal.v6g.k5.n5(var1.n5((byte)6), AutoShape.class);
         AutoShape var3 = com.aspose.slides.internal.v6g.k5.n5(var1.n5((byte)4), AutoShape.class);
         boolean var4 = n5(var2) && (n5(var3) || var3 != null && var3.k5());
         var0.n5(new com.aspose.slides.ms.System.o5<>(var4));
         return var4;
      } else {
         var0.n5(new com.aspose.slides.ms.System.o5<>(true));
         return true;
      }
   }

   private static boolean n5(AutoShape var0) {
      if (var0 != null) {
         Shape[] var1 = var0.f2();
         if (var1.length > 0) {
            AutoShape var2 = com.aspose.slides.internal.v6g.k5.n5(var1[0], AutoShape.class);
            return var2 != null && (var2.k5() || com.aspose.slides.ms.System.d1.n5(var0.getTextFrame().getText()));
         }
      }

      return false;
   }

   private static void l6(z4m var0) {
      AutoShape var1 = com.aspose.slides.internal.v6g.k5.n5(var0.l6().s7(), AutoShape.class);
      if (var1 != null) {
         if (com.aspose.slides.internal.v6g.k5.l6(var1.getSlide(), ISlide.class) || com.aspose.slides.internal.v6g.k5.l6(var1.getSlide(), INotesSlide.class)) {
            if (var1.getTextFrame() != null) {
               IPlaceholder var2 = var1.getPlaceholder();
               if (n5(var2)) {
                  var0.n5(1);
                  int var3 = s1f.n5(var2.getType());
                  var0.l6(var3);
                  var0.u3(0);
                  var0.n5();
                  n5(com.aspose.slides.internal.k0r.y3.n5(var0.a6(), var0.h0()), var0.l6());
               }
            }
         }
      }
   }

   static boolean n5(IPlaceholder var0) {
      if (var0 == null) {
         return false;
      }

      switch (var0.getType()) {
         case 4:
         case 5:
         case 6:
         case 7:
            return true;
         default:
            return false;
      }
   }

   static boolean l6(IPlaceholder var0) {
      if (var0 == null) {
         return false;
      }

      switch (var0.getType()) {
         case 0:
         case 1:
         case 4:
         case 5:
         case 6:
         case 7:
         case 14:
            return true;
         case 2:
         case 3:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         default:
            return false;
      }
   }

   private static void n5(int var0, k1z var1) {
      AutoShape var2 = com.aspose.slides.internal.v6g.k5.n5(var1.s7(), AutoShape.class);
      if (var2 != null) {
         var1.n5(var2.getTextFrame(), var0);
      }
   }
}
