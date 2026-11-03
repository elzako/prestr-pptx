package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.k4y.g7$n5;
import com.aspose.slides.ms.System.IDisposable;

class e0p {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9(
      "par", "audio", "spTgt", "bg", "inkTgt", "sldTgt", "sndTgt", "tmAbs", "tmPct", "subSp", "oleChartEl", "txEl", "graphicEl"
   );

   public static void n5(Sequence var0, com.aspose.slides.internal.k4y.q3a var1, w3j var2) {
      if (var1 == null) {
         throw new InvalidOperationException();
      }

      n5(var0, var1.u9().d2(), var2);
      n5(var0, var1);
   }

   public static void n5(Sequence var0, com.aspose.slides.internal.k4y.h7e var1, w3j var2) {
      if (var1 != null) {
         List$Enumerator var3 = var1.n5().iterator();

         try {
            while (var3.hasNext()) {
               com.aspose.slides.internal.k4y.g7 var4 = (com.aspose.slides.internal.k4y.g7)var3.next();
               switch (n5.n5(var4.n5())) {
                  case 0:
                     com.aspose.slides.internal.k4y.o2n var5 = com.aspose.slides.internal.v6g.k5.n5(var4.l6(), com.aspose.slides.internal.k4y.o2n.class);
                     n5(var0, null, var5, var2);
                     break;
                  case 1:
                     com.aspose.slides.internal.k4y.e3b var6 = com.aspose.slides.internal.v6g.k5.n5(var4.l6(), com.aspose.slides.internal.k4y.e3b.class);
                     n5(var0, var2, var6);
                     break;
                  default:
                     throw new PptxException("fail!");
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }
      }
   }

   private static void n5(Sequence var0, w3j var1, com.aspose.slides.internal.k4y.e3b var2) {
      Effect var3 = (Effect)var0.n5().u3().get_Item(var0.n5().u3().size() - 1);
      n5(var1, var2, var3);
      com.aspose.slides.internal.k4y.g7 var4 = new com.aspose.slides.internal.k4y.g7("audio", new com.aspose.slides.internal.k4y.e3b());
      var4.n5(var2);
      var3.k5().n5(new com.aspose.slides.internal.k4y.h7e());
      var3.k5().n3().n5(var4);
   }

   private static void n5(w3j var0, com.aspose.slides.internal.k4y.e3b var1, Effect var2) {
      if (var1 != null && var1.l6().u9() != null) {
         com.aspose.slides.internal.k4y.x7n var3 = com.aspose.slides.internal.v6g.k5.n5(var1.l6().u9().n5().l6(), com.aspose.slides.internal.k4y.x7n.class);
         if (var3 != null) {
            var2.k5().n5(var0.n5(var3.n5()));
         }
      }
   }

   public static void n5(Sequence var0, com.aspose.slides.internal.k4y.d1x[] var1, w3j var2) {
      for (com.aspose.slides.internal.k4y.d1x var6 : var1) {
         byte var7 = var6.n5();
         if (var7 == 4 && var6.k5() != null) {
            com.aspose.slides.internal.k4y.s2a var8 = com.aspose.slides.internal.v6g.k5.n5(var6.k5().l6(), com.aspose.slides.internal.k4y.s2a.class);
            if (var8 != null && "spTgt".equals(var8.n5().n5())) {
               com.aspose.slides.internal.k4y.h1f var9 = com.aspose.slides.internal.v6g.k5.n5(var8.n5().l6(), com.aspose.slides.internal.k4y.h1f.class);
               var0.setTriggerShape(n5(var2, var9.n5()));
            }
         }
      }
   }

   private static void n5(Sequence var0, com.aspose.slides.internal.k4y.q3a var1) {
      if (var0 != null && var1 != null && var1.u9().d2() != null && var1.u9().d2().n5() != null) {
         List$Enumerator var2 = var1.u9().d2().n5().iterator();

         try {
            while (var2.hasNext()) {
               com.aspose.slides.internal.k4y.g7 var3 = (com.aspose.slides.internal.k4y.g7)var2.next();
               com.aspose.slides.internal.k4y.o2n var4 = com.aspose.slides.internal.v6g.k5.n5(var3.l6(), com.aspose.slides.internal.k4y.o2n.class);
               if (var4 != null) {
                  List$Enumerator var5 = var0.n5().u3().iterator();

                  try {
                     while (var5.hasNext()) {
                        Effect var6 = (Effect)var5.next();
                        if (var6.k5().c8() == null) {
                           var6.k5().l6(0);
                        } else if (var6.k5().c8().n5().u9() > var4.n5().u9() || var4.n5().u9() < 0) {
                           var6.k5().l6(var0.l6().n5().n3());
                        }
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
                        var5.dispose();
                     }
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }
      }
   }

   public static Effect n5(Sequence var0, com.aspose.slides.internal.k4y.o2n var1, com.aspose.slides.internal.k4y.o2n var2, w3j var3) {
      com.aspose.slides.internal.k4y.n0d var4 = var2.n5();
      Effect var5 = null;
      if (var4.h0() - -2147483648L != -1L) {
         var5 = n5(var0, var1, var4, var3);
         var0.n5().u3().addItem(var5);
      }

      if (var4.d2() != null) {
         List$Enumerator var6 = var4.d2().n5().iterator();

         try {
            while (var6.hasNext()) {
               com.aspose.slides.internal.k4y.g7 var7 = (com.aspose.slides.internal.k4y.g7)var6.next();
               com.aspose.slides.internal.k4y.o2n var8 = com.aspose.slides.internal.v6g.k5.n5(var7.l6(), com.aspose.slides.internal.k4y.o2n.class);
               if (var8 != null) {
                  Effect var9 = n5(var0, var2, var8, var3);
                  if (var9 != null && com.aspose.slides.ms.System.n1.k5(var9.getTiming().getTriggerDelayTime())) {
                     n5(var4, var9.getTiming());
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
               var6.dispose();
            }
         }
      }

      return var5;
   }

   private static void n5(com.aspose.slides.internal.k4y.n0d var0, ITiming var1) {
      if (var0.c4() != null) {
         for (com.aspose.slides.internal.k4y.d1x var5 : var0.c4().l6()) {
            if (!"indefinite".equals(var5.l6())) {
               var1.setTriggerDelayTime(o5.n5(var5.l6()));
            }
         }
      }
   }

   private static Effect n5(Sequence var0, com.aspose.slides.internal.k4y.o2n var1, com.aspose.slides.internal.k4y.n0d var2, w3j var3) {
      long var4 = var2.h0();
      long var6 = var2.t2();
      Effect var8 = new Effect(var0);
      n5(var8.getTiming(), var2);
      if (var8.getTiming().getRepeatCount() == Float.POSITIVE_INFINITY && l6(var2.y2(), (byte)8)) {
         var8.getTiming().setRepeatUntilNextClick(true);
      }

      var8.k5().l6(var1);
      if (var0.n5().c8() != null) {
         var8.getTiming().setTriggerType(var0.n5().t2());
      } else {
         switch (var2.w1()) {
            case 0:
               var8.getTiming().setTriggerType(1);
               break;
            case 1:
               var8.getTiming().setTriggerType(2);
               break;
            case 2:
               var8.getTiming().setTriggerType(0);
         }
      }

      List$Enumerator var9 = var2.d2().n5().iterator();

      try {
         while (var9.hasNext()) {
            com.aspose.slides.internal.k4y.g7 var10 = (com.aspose.slides.internal.k4y.g7)var9.next();
            IBehavior var11 = null;
            com.aspose.slides.internal.k4y.u2q var12 = null;
            IBehavior[] var13 = new IBehavior[]{var11};
            com.aspose.slides.internal.k4y.u2q[] var14 = new com.aspose.slides.internal.k4y.u2q[]{var12};
            boolean var15 = n5(var10, var0, var13, var14);
            var11 = var13[0];
            var12 = var14[0];
            if (var15) {
               ((Behavior)var11).n5().n5(var8);
               o4.n5(var11, var10.l6(), var3);
               var8.getBehaviors().add(var11);
               n5(var0, var12, var8, var11, var3);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
            var9.dispose();
         }
      }

      n5(var8, var2.d5(), var3);
      if (var2.a0() != null) {
         var8.k5().l6(var2.a0().l6());
         var8.setAnimateTextType(n5(var2.a0().n5()));
         var8.setDelayBetweenTextParts(n5(var2.a0().k5()));
      }

      var8.k5().n5(var2.c8());
      switch (var8.k5().s7()) {
         case 0:
            var8.k5().k5(0);
            break;
         case 1:
            var8.k5().k5(1);
            break;
         case 2:
            var8.k5().k5(2);
            break;
         case 3:
            var8.k5().k5(3);
            break;
         case 4:
            var8.k5().k5(5);
            break;
         case 5:
            var8.k5().k5(4);
      }

      var8.k5().n5((int)var2.z8());
      var8.k5().n5(n5(o5.l6(var2.d2().n5().get_Item(0))) == 1);
      var8.k5().u3(z9u.n5(var4, var2.c8()));
      var8.k5().a6(z9u.l6(var8.k5().s7(), var8.k5().e2(), var6));
      return var8;
   }

   private static boolean n5(Effect var0, AutoShape var1, com.aspose.slides.internal.k4y.v6b var2) {
      String var3 = var1.getTextFrame().getText();
      if (com.aspose.slides.ms.System.d1.n5(var3)) {
         return false;
      }

      int var4 = 0;
      int var5 = -1;
      int var6 = -1;
      IParagraphCollection var7 = var1.getTextFrame().getParagraphs();

      for (int var8 = 0; var8 < var7.getCount(); var8++) {
         IParagraph var9 = var7.get_Item(var8);
         if (com.aspose.slides.ms.System.d1.n5(var9.getText())) {
            var4++;
         } else {
            if (var5 == -1 && var4 == (var2.n5() & 4294967295L)) {
               var5 = var8;
            }

            int var10 = var4 + com.aspose.slides.internal.v6g.k5.n5(var9, Paragraph.class).u3().length() + 1;
            if (var6 == -1 && var10 == (var2.l6() & 4294967295L)) {
               var6 = var8;
            }

            if (var5 > -1 && var6 > -1) {
               var0.n5(var5, var6, (ParagraphCollection)var7);
               return true;
            }

            var4 = var10;
         }
      }

      return false;
   }

   private static void n5(Sequence var0, com.aspose.slides.internal.k4y.u2q var1, Effect var2, IBehavior var3, w3j var4) {
      k1 var5 = ((Behavior)var3).n5();
      com.aspose.slides.internal.k4y.n0d var6 = var1.u9();
      n5(var3.getTiming(), var6);
      var5.n5(var1.a6());
      var5.l6(var6.z3());
      var5.n5(var1.u3());
      switch (var1.k5()) {
         case -1:
            var3.setAccumulate((byte)-1);
            break;
         case 0:
            var3.setAccumulate((byte)0);
            break;
         case 1:
            var3.setAccumulate((byte)1);
      }

      var3.setAdditive(var1.l6());
      if (var0.n5().c8() != null) {
         var2.k5().n5(var0.n5().c8());
      } else {
         com.aspose.slides.internal.k4y.s2a var7 = var1.h0();
         if (var7.n5() == null) {
            return;
         }

         switch (n5.n5(var7.n5().n5())) {
            case 2:
               com.aspose.slides.internal.k4y.h1f var8 = com.aspose.slides.internal.v6g.k5.n5(var7.n5().l6(), com.aspose.slides.internal.k4y.h1f.class);
               var2.k5().n5(var8);
               var2.k5().n5(n5(var4, var8.n5()));
               com.aspose.slides.internal.k4y.g7 var9 = var8.l6();
               if (var9 != null && "txEl".equals(var9.n5())) {
                  com.aspose.slides.internal.k4y.t4n var10 = com.aspose.slides.internal.v6g.k5.n5(var9.l6(), com.aspose.slides.internal.k4y.t4n.class);
                  AutoShape var11 = com.aspose.slides.internal.v6g.k5.n5(var2.k5().u3(), AutoShape.class);
                  if (var11 != null && var11.getTextFrame().getParagraphs().getCount() != 0) {
                     com.aspose.slides.internal.k4y.v6b var12 = com.aspose.slides.internal.v6g.k5.n5(var10.n5().l6(), com.aspose.slides.internal.k4y.v6b.class);
                     if ("pRg".equals(var10.n5().n5())) {
                        IParagraphCollection var13 = var11.getTextFrame().getParagraphs();
                        if ((int)var12.n5() < var13.getCount() && (int)var12.l6() < var13.getCount()) {
                           var2.n5((int)var12.n5(), (int)var12.l6(), (ParagraphCollection)var13);
                        }
                     } else if ("charRg".equals(var10.n5().n5()) && !n5(var2, var11, var12)) {
                        var2.k5().n5(var12);
                     }
                  }
               }
            case 3:
            case 4:
            case 5:
            case 6:
               break;
            default:
               throw new PptxException("fail!");
         }
      }
   }

   private static void n5(ITiming var0, com.aspose.slides.internal.k4y.n0d var1) {
      var0.setAccelerate(var1.e2() / 100.0F);
      var0.setDecelerate(var1.t9() / 100.0F);
      var0.setAutoReverse(var1.z1());
      var0.setRepeatCount(o5.n5(var1.x8()));
      var0.setRepeatDuration(o5.n5(var1.n3()));
      var0.setRestart(var1.t4());
      var0.setSpeed(var1.y4() / 100.0F);
      ((Timing)var0).n5(o5.n5(var1.s7()));
      ((Timing)var0).n5(var1.q0());
      n5(var1, var0);
   }

   private static void n5(Effect var0, com.aspose.slides.internal.k4y.h7e var1, w3j var2) {
      if (var1 != null) {
         com.aspose.slides.internal.k4y.h7e var3 = new com.aspose.slides.internal.k4y.h7e();
         List$Enumerator var4 = var1.n5().iterator();

         try {
            while (var4.hasNext()) {
               com.aspose.slides.internal.k4y.g7 var5 = (com.aspose.slides.internal.k4y.g7)var4.next();
               com.aspose.slides.internal.k4y.e3b var6 = com.aspose.slides.internal.v6g.k5.n5(var5.l6(), com.aspose.slides.internal.k4y.e3b.class);
               if (var6 != null) {
                  n5(var2, var6, var0);
               } else {
                  com.aspose.slides.internal.k4y.s1z var7 = com.aspose.slides.internal.v6g.k5.n5(var5.l6(), com.aspose.slides.internal.k4y.s1z.class);
                  if (var7 != null && com.aspose.slides.ms.System.d1.a6(var7.l6(), com.aspose.slides.ms.System.d1.u9("onStopAudio"))) {
                     var0.k5().k5(true);
                  } else {
                     com.aspose.slides.internal.k4y.s5v var8 = com.aspose.slides.internal.v6g.k5.n5(var5.l6(), com.aspose.slides.internal.k4y.s5v.class);
                     if (var8 != null) {
                        var0.setAfterAnimationType(1);
                        c4i.n5(var0.getAfterAnimationColor(), var8.t2());
                     } else {
                        com.aspose.slides.internal.k4y.p2j var9 = com.aspose.slides.internal.v6g.k5.n5(var5.l6(), com.aspose.slides.internal.k4y.p2j.class);
                        if (var9 != null && var9.k5() != null && var9.l6() != null) {
                           com.aspose.slides.internal.k4y.w8j var10 = com.aspose.slides.internal.v6g.k5.n5(
                              var9.k5().n5().l6(), com.aspose.slides.internal.k4y.w8j.class
                           );
                           if (var10 != null && "hidden".equals(var10.n5())) {
                              com.aspose.slides.internal.k4y.n0d var11 = var9.l6().u9();
                              if (var11.j5() == 1) {
                                 switch (var11.m3()) {
                                    case 0:
                                       var0.setAfterAnimationType(2);
                                       continue;
                                    case 2:
                                       var0.setAfterAnimationType(3);
                                       continue;
                                 }
                              }
                           }
                        }

                        var3.n5(var5);
                     }
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }

         if (var3.n5().size() > 0) {
            var0.k5().n5(var3);
         }
      }
   }

   static IShape n5(w3j var0, com.aspose.slides.internal.k4y.s2a var1) {
      if ("spTgt".equals(var1.n5().n5())) {
         com.aspose.slides.internal.k4y.h1f var2 = com.aspose.slides.internal.v6g.k5.n5(var1.n5().l6(), com.aspose.slides.internal.k4y.h1f.class);
         return n5(var0, var2.n5());
      } else {
         return null;
      }
   }

   static IShape n5(w3j var0, String var1) {
      if (var1 == null) {
         return null;
      } else {
         return var0.n5().containsKey(var1) ? com.aspose.slides.internal.v6g.k5.n5(var0.n5().get_Item(var1), IShape.class) : null;
      }
   }

   private static boolean n5(com.aspose.slides.internal.k4y.g7 var0, Sequence var1, IBehavior[] var2, com.aspose.slides.internal.k4y.u2q[] var3) {
      if ("animMotion".equals(var0.n5())) {
         com.aspose.slides.internal.k4y.h7g var4 = com.aspose.slides.internal.v6g.k5.n5(var0.l6(), com.aspose.slides.internal.k4y.h7g.class);
         var3[0] = var4.s7();
         var2[0] = var1.n5().s7().createMotionEffect();
      } else if ("set".equals(var0.n5())) {
         com.aspose.slides.internal.k4y.p2j var5 = com.aspose.slides.internal.v6g.k5.n5(var0.l6(), com.aspose.slides.internal.k4y.p2j.class);
         var3[0] = var5.l6();
         var2[0] = var1.n5().s7().createSetEffect();
      } else if ("animEffect".equals(var0.n5())) {
         com.aspose.slides.internal.k4y.n3m var6 = com.aspose.slides.internal.v6g.k5.n5(var0.l6(), com.aspose.slides.internal.k4y.n3m.class);
         var3[0] = var6.u3();
         var2[0] = var1.n5().s7().createFilterEffect();
      } else if ("anim".equals(var0.n5())) {
         com.aspose.slides.internal.k4y.a4w var7 = com.aspose.slides.internal.v6g.k5.n5(var0.l6(), com.aspose.slides.internal.k4y.a4w.class);
         var3[0] = var7.h0();
         var2[0] = var1.n5().s7().createPropertyEffect();
      } else if ("animClr".equals(var0.n5())) {
         com.aspose.slides.internal.k4y.s5v var8 = com.aspose.slides.internal.v6g.k5.n5(var0.l6(), com.aspose.slides.internal.k4y.s5v.class);
         var3[0] = var8.u9();
         var2[0] = var1.n5().s7().createColorEffect();
      } else if ("animScale".equals(var0.n5())) {
         com.aspose.slides.internal.k4y.q6i var9 = com.aspose.slides.internal.v6g.k5.n5(var0.l6(), com.aspose.slides.internal.k4y.q6i.class);
         var3[0] = var9.a6();
         var2[0] = var1.n5().s7().createScaleEffect();
      } else if ("animRot".equals(var0.n5())) {
         com.aspose.slides.internal.k4y.c3t var10 = com.aspose.slides.internal.v6g.k5.n5(var0.l6(), com.aspose.slides.internal.k4y.c3t.class);
         var3[0] = var10.u3();
         var2[0] = var1.n5().s7().createRotationEffect();
      } else if ("cmd".equals(var0.n5())) {
         com.aspose.slides.internal.k4y.s1z var11 = com.aspose.slides.internal.v6g.k5.n5(var0.l6(), com.aspose.slides.internal.k4y.s1z.class);
         var3[0] = var11.k5();
         var2[0] = var1.n5().s7().createCommandEffect();
      } else {
         var2[0] = null;
         var3[0] = null;
      }

      return var2[0] != null;
   }

   private static float n5(com.aspose.slides.internal.k4y.g7 var0) {
      switch (n5.n5(var0.n5())) {
         case 7:
            com.aspose.slides.internal.k4y.q4e var1 = (com.aspose.slides.internal.k4y.q4e)var0.l6();
            return -o5.n5(var1.n5());
         case 8:
            com.aspose.slides.internal.k4y.u6e var2 = (com.aspose.slides.internal.k4y.u6e)var0.l6();
            return var2.n5();
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", var0.n5(), "\""}));
      }
   }

   private static byte n5(com.aspose.slides.internal.k4y.u2q var0) {
      if (var0 != null && var0.h0() != null && var0.h0().n5() != null) {
         com.aspose.slides.internal.k4y.h1f var1 = com.aspose.slides.internal.v6g.k5.n5(var0.h0().n5().l6(), com.aspose.slides.internal.k4y.h1f.class);
         if (var1 != null && var1.l6() != null) {
            switch (n5.n5(var1.l6().n5())) {
               case 3:
                  return 1;
               case 4:
               case 5:
               case 6:
               case 7:
               case 8:
               default:
                  throw new InvalidOperationException("Unknown element");
               case 9:
                  return 2;
               case 10:
                  return 3;
               case 11:
                  return 4;
               case 12:
                  return 5;
            }
         } else {
            return 0;
         }
      } else {
         return 0;
      }
   }

   private static int n5(byte var0) {
      switch (var0) {
         case 1:
            return 1;
         case 2:
            return 2;
         default:
            return 0;
      }
   }

   static void n5(Sequence var0, IShapeCollection var1, int[] var2, com.aspose.slides.internal.k4y.h7e var3, d5t var4) {
      if (var0.getCount() != 0) {
         com.aspose.slides.internal.k4y.q3a var5;
         if (var0.n5().n5() == 3) {
            var2[0]++;
            var5 = n5(new e0p$1(var3), var2[0]);
         } else {
            if (var0.n5().n5() != 4) {
               throw new InvalidOperationException("Unknown sequence type");
            }

            if (!var4.n5(var0.getTriggerShape())) {
               return;
            }

            var2[0]++;
            var5 = n5(var0, new e0p$2(var3), var2[0]);
         }

         com.aspose.slides.internal.k4y.h7e var6 = null;
         var0.n5().n5(var2[0]);
         var0.n5().n5((com.aspose.slides.internal.k4y.o2n)null);
         var0.n5().k5(0.0F);
         var0.n5().l6(0.0F);
         var0.n5().n5(0.0F);
         if (var0.n5().u3().size() == 0) {
            var6 = var5.u9().a6();
            com.aspose.slides.internal.k4y.o2n var7 = n5(var0, var6);
         } else {
            Dictionary var25 = new Dictionary();
            Dictionary var8 = new Dictionary();
            com.aspose.slides.internal.k4y.o2n var9 = null;

            for (int var10 = 0; var10 < var0.n5().u3().size(); var10++) {
               Effect var11 = (Effect)var0.n5().u3().get_Item(var10);
               IShape var12 = var11.k5().u3();
               boolean var13 = false;
               IGenericEnumerator var14 = var11.getBehaviors().iterator();

               try {
                  while (var14.hasNext()) {
                     IBehavior var15 = (IBehavior)var14.next();
                     var13 |= com.aspose.slides.internal.v6g.k5.l6(var15, f6w.class);
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
                     var14.dispose();
                  }
               }

               if (!var13) {
                  boolean var26 = n5(var0, var11);
                  if (var4.n5(var12)) {
                     if (var6 == null) {
                        var6 = var5.u9().a6();
                     }

                     long var17 = o5.l6(var12);
                     long var19 = var11.k5().l6() & 4294967295L;
                     if (var9 == null || !var26) {
                        if (!var8.containsKey(var17)) {
                           var9 = n5(var8, var17, var0, var6);
                        } else if (!var25.containsKey(var19)) {
                           var9 = n5(var25, var19, var0, var6);
                        } else if (com.aspose.slides.internal.v6g.k5.l6(var12, IChart.class)) {
                           var9 = n5(var0, var6);
                           var9.n5().a6();
                        }
                     }

                     if (var10 > 0 && var11.getTiming().getTriggerType() == 1) {
                        var0.n5().n5(0.0F);
                     }

                     if (var9 == null) {
                        throw new NullReferenceException("JointElement couldn't be empty.");
                     }

                     com.aspose.slides.internal.k4y.o2n var21 = var9;
                     if (var11.getTiming().getTriggerType() == 0) {
                        var0.n5().n5(n5(var0, new e0p$3(var21), var0.n5().a6()));
                        var26 = true;
                     }

                     n5(var0, var11, var26, new e0p$4(var21), var4, var3);
                  }
               }
            }
         }

         var2[0] = var0.n5().l6();
      }
   }

   private static com.aspose.slides.internal.k4y.o2n n5(
      Dictionary<Long, com.aspose.slides.internal.k4y.o2n> var0, long var1, Sequence var3, com.aspose.slides.internal.k4y.h7e var4
   ) {
      com.aspose.slides.internal.k4y.o2n var5 = n5(var3, var4);
      var5.n5().a6();
      var0.addItem(var1, var5);
      return var5;
   }

   private static com.aspose.slides.internal.k4y.o2n n5(Sequence var0, g7$n5 var1) {
      return n5(var0, var1, Float.POSITIVE_INFINITY);
   }

   private static com.aspose.slides.internal.k4y.o2n n5(Sequence var0, g7$n5 var1, float var2) {
      var0.n5().l6(0.0F);
      com.aspose.slides.internal.k4y.o2n var3 = (com.aspose.slides.internal.k4y.o2n)var1.n5("par").l6();
      var0.n5().l6(var3);
      int var4 = var0.n5().l6() + 1;
      var0.n5().n5(var4);
      var3.n5().n5(var4);
      var3.n5().k5((byte)2);
      var3.n5().h0((byte)7);
      n5(var3.n5(), var2);
      return var3;
   }

   private static com.aspose.slides.internal.k4y.o2n n5(Sequence var0, com.aspose.slides.internal.k4y.h7e var1) {
      com.aspose.slides.internal.k4y.o2n var2 = n5(var0, new e0p$5(var1));
      var2.n5().h0((byte)5);
      if (var0.n5().n5() == 4 && var1.n5().size() == 1) {
         var2.n5().c4().l6()[0].l6(o5.n5(0.0F));
      }

      n5(var0, new e0p$6(var2));
      return var2;
   }

   private static void n5(Sequence var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.d1x> var1) {
      Effect var2 = (Effect)var0.n5().u3().get_Item(0);
      if (var2.getTiming().getTriggerType() == 0 || var2.getTiming().getTriggerType() == 2) {
         com.aspose.slides.internal.k4y.d1x var3 = (com.aspose.slides.internal.k4y.d1x)var1.invoke();
         var3.l6(o5.n5(0.0F));
         var3.n5((byte)0);
         com.aspose.slides.internal.k4y.i1s var4 = (com.aspose.slides.internal.k4y.i1s)var3.n5("tn").l6();
         if (var0.n5().l6() != 1) {
            var4.n5(var0.n5().l6() - 1);
         }
      }
   }

   static void n5(Sequence var0, Effect var1, boolean var2, g7$n5 var3, d5t var4, com.aspose.slides.internal.k4y.h7e var5) {
      com.aspose.slides.internal.k4y.o2n var6 = var2 && var0.n5().k5() != null ? var0.n5().k5() : n5(var1, var0, var3);
      com.aspose.slides.internal.k4y.h7e var7 = var6.n5().d2();
      if (var7 == null) {
         var7 = var6.n5().a6();
      }

      com.aspose.slides.internal.k4y.o2n var8 = (com.aspose.slides.internal.k4y.o2n)var7.n5("par").l6();
      int var9 = var0.n5().l6() + 1;
      var0.n5().n5(var9);
      var8.n5().n5(var9);
      var8.n5().n5((long)z9u.n5(var1.k5().e2(), var1.k5().s7()));
      var8.n5().l6(z9u.x8(var1.k5().t9()));
      var8.n5().n5(var1.k5().s7());
      Timing var10 = (Timing)var1.getTiming();
      var8.n5().l6(var10.getAccelerate() * 100.0F);
      var8.n5().k5(var10.getDecelerate() * 100.0F);
      var8.n5().n5(var10.getAutoReverse());
      var8.n5().l6((byte)var10.getRestart());
      var8.n5().n5(var10.getSpeed() * 100.0F);
      if (var1.k5().n5() != -1) {
         var8.n5().k5(var1.k5().n5() & 4294967295L);
      }

      if (!com.aspose.slides.ms.System.n1.k5(var10.n5())) {
         var8.n5().n5(o5.n5(var10.n5()));
      }

      if (var10.getRepeatCount() != 1.0F && var1.getPresetClassType() != 4) {
         var8.n5().l6(o5.n5(var10.getRepeatCount()));
         if (var10.getRepeatUntilNextClick() && !l6(var8.n5().y2(), (byte)8)) {
            com.aspose.slides.internal.k4y.z2x var11 = var8.n5().l6();
            n5(var11, (byte)8);
         }
      }

      var8.n5().k5((byte)((Timing)var1.getTiming()).l6());
      if (var1.k5().x8() || var1.getAnimateTextType() != 0 || var1.getDelayBetweenTextParts() != 0.0F) {
         com.aspose.slides.internal.k4y.b6z var14 = var8.n5().u3();
         var14.n5(var1.k5().x8());
         var14.n5(n5(var1.getAnimateTextType()));
         n5(new e0p$7(var14), var1.getDelayBetweenTextParts());
      }

      var1.k5().n5(var8);
      switch (var10.getTriggerType()) {
         case 0:
            var8.n5().h0((byte)2);
            break;
         case 1:
            var8.n5().h0((byte)0);
            break;
         case 2:
            var8.n5().h0((byte)1);
            break;
         default:
            throw new ArgumentOutOfRangeException("effect");
      }

      n5(var8.n5(), var1.getTiming().getTriggerDelayTime());
      var0.n5().k5(0.0F);
      n5(var0, var1, var8);
      com.aspose.slides.internal.k4y.h7e var15 = var1.k5().n3();
      if (var15 == null) {
         var15 = new com.aspose.slides.internal.k4y.h7e();
      }

      var8.n5().n5(var15);
      o5f.n5(var0, var1, var8, var4, var5);
      n5(var1, var8);
      if (var8.n5().d5().n5().size() == 0) {
         var8.n5().n5((com.aspose.slides.internal.k4y.h7e)null);
      }

      float var12 = com.aspose.slides.ms.System.n1.k5(var1.getTiming().getTriggerDelayTime()) ? 0.0F : var1.getTiming().getTriggerDelayTime();
      if (var1.getTiming().getTriggerType() == 2) {
         float var13 = var0.n5().h0() + var12;
         if (var13 > var0.n5().u9()) {
            var0.n5().n5(var0.n5().a6() - var0.n5().u9());
            var0.n5().n5(var0.n5().a6() + var13);
            var0.n5().k5(var13);
            var0.n5().l6(var0.n5().h0());
         }
      } else {
         var0.n5().l6(var0.n5().h0() + var12);
         var0.n5().k5(var0.n5().h0() + var0.n5().u9());
         var0.n5().n5(var0.n5().a6() + var0.n5().u9());
      }
   }

   private static void n5(com.aspose.slides.internal.k4y.n0d var0, float var1) {
      if (!com.aspose.slides.ms.System.n1.k5(var1)) {
         com.aspose.slides.internal.k4y.d1x var2 = var0.n5().n5();
         var2.l6(o5.n5(var1));
      }
   }

   private static void n5(Sequence var0, Effect var1, com.aspose.slides.internal.k4y.o2n var2) {
      com.aspose.slides.internal.k4y.h7e var3 = null;
      if (var1.getBehaviors().getCount() > 0) {
         var3 = var2.n5().a6();
      }

      IGenericEnumerator var4 = var1.getBehaviors().iterator();

      try {
         while (var4.hasNext()) {
            IBehavior var5 = (IBehavior)var4.next();
            k1 var6 = ((Behavior)var5).n5();
            com.aspose.slides.internal.k4y.u2q var7 = null;
            com.aspose.slides.internal.k4y.u2q[] var8 = new com.aspose.slides.internal.k4y.u2q[]{var7};
            com.aspose.slides.internal.k4y.h7e var9 = var3;
            o4.n5(var5, new e0p$8(var9), var8);
            var7 = var8[0];
            if (var7 == null) {
               throw new PptxException("fail.");
            }

            switch (var5.getAccumulate()) {
               case -1:
                  var7.l6((byte)-1);
                  break;
               case 0:
                  var7.l6((byte)0);
                  break;
               case 1:
                  var7.l6((byte)1);
            }

            var7.n5(var6.l6());
            Timing var10 = (Timing)var5.getTiming();
            if (!com.aspose.slides.ms.System.n1.k5(var10.n5())) {
               var7.u9().n5(o5.n5(var10.n5()));
            }

            var7.u9().n5(var10.getSpeed() * 100.0F);
            var7.u9().l6(var10.getAccelerate() * 100.0F);
            var7.u9().k5(var10.getDecelerate() * 100.0F);
            var7.u9().n5(var10.getAutoReverse());
            if (var10.getRepeatCount() != 1.0F) {
               var7.u9().l6(o5.n5(var10.getRepeatCount()));
            }

            var7.n5((byte)var5.getAdditive());
            com.aspose.slides.internal.k4y.h1f var11 = (com.aspose.slides.internal.k4y.h1f)var7.h0().n5("spTgt").l6();
            var11.l6(o5.n5(var1.k5().u3()));
            if (com.aspose.slides.internal.v6g.k5.l6(var1.k5().u3(), Chart.class) && !e6a.n5(var1)) {
               e6a.n5(var11, var0.n5().u3(), var1, (Chart)var1.k5().u3());
            }

            if (var1.k5().k5() && var11.l6() == null) {
               var11.n5("bg");
            }

            if (var1.k5().q0() != null && var1.k5().q0().l6() != null) {
               com.aspose.slides.internal.k4y.f3 var12 = com.aspose.slides.internal.v6g.k5.n5(var1.k5().q0().l6().l6(), com.aspose.slides.internal.k4y.f3.class);
               if (var12 != null) {
                  var11.n5(new com.aspose.slides.internal.k4y.g7("graphicEl", var12));
               } else {
                  com.aspose.slides.internal.k4y.v4l var13 = com.aspose.slides.internal.v6g.k5.n5(
                     var1.k5().q0().l6().l6(), com.aspose.slides.internal.k4y.v4l.class
                  );
                  if (var13 != null) {
                     var11.n5(new com.aspose.slides.internal.k4y.g7("oleChartEl", var13));
                  }
               }
            }

            var7.u9().k5((byte)((Timing)var5.getTiming()).l6());
            var7.u3(var6.n5());
            var7.u9().u3(var6.k5());
            int var18 = var0.n5().l6() + 1;
            var0.n5().n5(var18);
            var7.u9().n5(var18);
            float var19 = com.aspose.slides.ms.System.n1.k5(var10.getTriggerDelayTime()) ? 0.0F : var10.getTriggerDelayTime();
            if (var19 + var10.n5() > var0.n5().h0()) {
               var0.n5().k5(var19 + var10.n5());
            }

            n5(var7.u9(), var10.getTriggerDelayTime());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }
   }

   private static boolean n5(Sequence var0, Effect var1) {
      return var1.getTiming().getTriggerType() == 2 || var1.getTiming().getTriggerType() == 0 && var0.n5().k5() != null;
   }

   private static com.aspose.slides.internal.k4y.o2n n5(Effect var0, Sequence var1, g7$n5 var2) {
      com.aspose.slides.internal.k4y.o2n var3 = (com.aspose.slides.internal.k4y.o2n)var2.n5("par").l6();
      var1.n5().n5(var3);
      int var4 = var1.n5().l6() + 1;
      var1.n5().n5(var4);
      var3.n5().n5(var4);
      var3.n5().k5((byte)2);
      var3.n5().h0(var0.k5().c8() == null ? 7 : var0.k5().c8().n5().w1());
      com.aspose.slides.internal.k4y.z2x var5 = var3.n5().n5();
      com.aspose.slides.internal.k4y.d1x var6 = var5.n5();
      if (var0.k5().c8() != null && var0.k5().c8().n5().c4() != null && var0.k5().c8().n5().c4().l6() != null && var0.k5().c8().n5().c4().l6().length > 0) {
         var6.l6(var0.k5().c8().n5().c4().l6()[0].l6());
      } else {
         var6.l6(o5.n5(var1.n5().a6()));
      }

      return var3;
   }

   private static com.aspose.slides.internal.k4y.q3a n5(g7$n5 var0, int var1) {
      com.aspose.slides.internal.k4y.q3a var2 = (com.aspose.slides.internal.k4y.q3a)var0.n5("seq").l6();
      var2.u9().n5(var1);
      var2.n5((byte)1);
      var2.l6((byte)1);
      var2.u9().n5(o5.n5(Float.POSITIVE_INFINITY));
      var2.u9().h0((byte)3);
      com.aspose.slides.internal.k4y.z2x var3 = var2.n5();
      n5(var3, (byte)9);
      com.aspose.slides.internal.k4y.z2x var4 = var2.l6();
      n5(var4, (byte)8);
      return var2;
   }

   private static com.aspose.slides.internal.k4y.q3a n5(Sequence var0, g7$n5 var1, int var2) {
      com.aspose.slides.internal.k4y.q3a var3 = (com.aspose.slides.internal.k4y.q3a)var1.n5("seq").l6();
      var3.u9().n5(var2);
      var3.n5((byte)1);
      var3.l6((byte)1);
      var3.u9().h0((byte)4);
      var3.u9().l6((byte)1);
      var3.u9().k5((byte)2);
      var3.u9().a6("cancelBubble");
      com.aspose.slides.internal.k4y.z2x var4 = var3.u9().n5();
      n5(var4, o5.n5(var0.getTriggerShape()));
      com.aspose.slides.internal.k4y.z2x var5 = var3.l6();
      n5(var5, o5.n5(var0.getTriggerShape()));
      com.aspose.slides.internal.k4y.d1x var6 = var3.u9().k5();
      var6.n5((byte)3);
      var6.l6(o5.n5(0.0F));
      com.aspose.slides.internal.k4y.v0e var7 = (com.aspose.slides.internal.k4y.v0e)var6.n5("rtn").l6();
      var7.n5(3);
      return var3;
   }

   private static void n5(com.aspose.slides.internal.k4y.z2x var0, byte var1) {
      com.aspose.slides.internal.k4y.d1x var2 = var0.n5();
      var2.n5(var1);
      var2.l6(o5.n5(0.0F));
      com.aspose.slides.internal.k4y.s2a var3 = (com.aspose.slides.internal.k4y.s2a)var2.n5("tgtEl").l6();
      var3.n5("sldTgt");
   }

   private static boolean l6(com.aspose.slides.internal.k4y.z2x var0, byte var1) {
      if (var0 != null && var0.l6() != null && var0.l6().length != 0) {
         for (com.aspose.slides.internal.k4y.d1x var5 : var0.l6()) {
            if (var5.n5() == var1 && var5.k5() != null) {
               com.aspose.slides.internal.k4y.s2a var6 = com.aspose.slides.internal.v6g.k5.n5(var5.k5().l6(), com.aspose.slides.internal.k4y.s2a.class);
               if (var6 != null && "sldTgt".equals(var6.n5().n5())) {
                  return true;
               }
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private static void n5(com.aspose.slides.internal.k4y.z2x var0, String var1) {
      com.aspose.slides.internal.k4y.d1x var2 = var0.n5();
      var2.n5((byte)4);
      var2.l6(o5.n5(0.0F));
      com.aspose.slides.internal.k4y.s2a var3 = (com.aspose.slides.internal.k4y.s2a)var2.n5("tgtEl").l6();
      com.aspose.slides.internal.k4y.h1f var4 = (com.aspose.slides.internal.k4y.h1f)var3.n5("spTgt").l6();
      var4.l6(var1);
   }

   private static byte n5(int var0) {
      switch (var0) {
         case 1:
            return 1;
         case 2:
            return 2;
         default:
            return 0;
      }
   }

   private static void n5(g7$n5 var0, float var1) {
      if (var1 < 0.0F) {
         com.aspose.slides.internal.k4y.q4e var2 = (com.aspose.slides.internal.k4y.q4e)var0.n5("tmAbs").l6();
         if (!com.aspose.slides.ms.System.n1.k5(var1)) {
            var2.n5(o5.n5(-var1));
         }
      } else {
         com.aspose.slides.internal.k4y.u6e var3 = (com.aspose.slides.internal.k4y.u6e)var0.n5("tmPct").l6();
         var3.n5(var1);
      }
   }

   static void n5(Effect var0, com.aspose.slides.internal.k4y.o2n var1) {
      com.aspose.slides.internal.k4y.h7e var2 = var1.n5().d5();
      switch (var0.getAfterAnimationType()) {
         case 1:
            n5(var2, var0);
            break;
         case 2:
            n5(var1, var0, (byte)0);
            break;
         case 3:
            n5(var1, var0, (byte)2);
      }
   }

   static void n5(com.aspose.slides.internal.k4y.h7e var0, Effect var1) {
      com.aspose.slides.internal.k4y.s5v var2 = (com.aspose.slides.internal.k4y.s5v)var0.n5("animClr").l6();
      var2.l6((byte)0);
      var2.n5((byte)0);
      com.aspose.slides.internal.k4y.u2q var3 = var2.u9();
      n5(var3, var1, (byte)2);
      com.aspose.slides.internal.k4y.g1l var4 = var3.n5();
      var4.n5("ppt_c");
      com.aspose.slides.internal.k4y.z4 var5 = var2.k5();
      c4i.l6(var1.getAfterAnimationColor(), var5);
   }

   static void n5(com.aspose.slides.internal.k4y.o2n var0, Effect var1, byte var2) {
      com.aspose.slides.internal.k4y.h7e var3 = var0.n5().d5();
      com.aspose.slides.internal.k4y.p2j var4 = (com.aspose.slides.internal.k4y.p2j)var3.n5("set").l6();
      com.aspose.slides.internal.k4y.u2q var5 = var4.l6();
      n5(var5, var1, var2);
      if (var2 == 0) {
         com.aspose.slides.internal.k4y.d1x var6 = var5.u9().n5().n5();
         var6.n5((byte)3);
         var6.l6("0");
         com.aspose.slides.internal.k4y.i1s var7 = (com.aspose.slides.internal.k4y.i1s)var6.n5("tn").l6();
         var7.n5(var0.n5().u9());
      }

      com.aspose.slides.internal.k4y.g1l var9 = var5.n5();
      var9.n5("style.visibility");
      com.aspose.slides.internal.k4y.k7v var10 = var4.n5();
      com.aspose.slides.internal.k4y.w8j var8 = (com.aspose.slides.internal.k4y.w8j)var10.n5("strVal").l6();
      var8.n5("hidden");
   }

   private static void n5(com.aspose.slides.internal.k4y.u2q var0, Effect var1, byte var2) {
      var0.u3((byte)1);
      var0.u9().u9((byte)1);
      var0.u9().a6(var2);
      var0.u9().u3((byte)0);
      var0.u9().k5((byte)2);
      var0.u9().n5("1");
      com.aspose.slides.internal.k4y.h1f var3 = (com.aspose.slides.internal.k4y.h1f)var0.h0().n5("spTgt").l6();
      var3.l6(o5.n5(var1.k5().u3()));
   }
}
