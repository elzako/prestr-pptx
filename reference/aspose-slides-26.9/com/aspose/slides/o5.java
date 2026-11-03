package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;

class o5 {
   private static final List<String> n5 = new List<>();
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("bldP", "bldDgm", "bldOleChart", "bldGraphic");

   public static void n5(IAnimationTimeLine var0, com.aspose.slides.internal.k4y.k8g var1, w3j var2) {
      if (var1 != null && var1.k5() != null && var1.k5().n5().size() != 0) {
         com.aspose.slides.internal.k4y.n0d var3 = n5(var1.k5().n5().get_Item(0));
         if (var3 == null) {
            throw new PptxReadException("TimeLine.Load, error reading slide.");
         }

         if (var3.d2() != null && var3.d2().n5().size() != 0) {
            if (var3.w1() == -1) {
               var3.h0((byte)8);
            }

            n5(var3.d2().n5(), var0, var2);
            List var4 = new List();
            var4.addItem(var0.getMainSequence());
            var4.addRange(var0.getInteractiveSequences());
            n5(var0, var4, var1, var2);
         }
      }
   }

   private static boolean n5(byte var0) {
      return var0 == 3 || var0 == 4;
   }

   private static void n5(IGenericEnumerable<com.aspose.slides.internal.k4y.g7> var0, IAnimationTimeLine var1, w3j var2) {
      IGenericEnumerator var3 = var0.iterator();

      try {
         while (var3.hasNext()) {
            com.aspose.slides.internal.k4y.g7 var4 = (com.aspose.slides.internal.k4y.g7)var3.next();
            com.aspose.slides.internal.k4y.n0d var5 = n5(var4);
            if (var5 != null) {
               byte var6 = var5.w1();
               if (n5(var6)) {
                  n5(var6, var1, var4, var2);
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   private static void n5(byte var0, IAnimationTimeLine var1, com.aspose.slides.internal.k4y.g7 var2, w3j var3) {
      switch (var0) {
         case 3:
            e0p.n5((Sequence)var1.getMainSequence(), com.aspose.slides.internal.v6g.k5.n5(var2.l6(), com.aspose.slides.internal.k4y.q3a.class), var3);
            break;
         case 4:
            Sequence var4 = (Sequence)var1.getInteractiveSequences().add(null);
            com.aspose.slides.internal.k4y.q3a var5 = com.aspose.slides.internal.v6g.k5.n5(var2.l6(), com.aspose.slides.internal.k4y.q3a.class);
            if (var5 != null) {
               if (var5.u9().c4() != null) {
                  e0p.n5(var4, var5.u9().c4().l6(), var3);
               }

               e0p.n5(var4, var5, var3);
            } else {
               com.aspose.slides.internal.k4y.o2n var6 = com.aspose.slides.internal.v6g.k5.n5(var2.l6(), com.aspose.slides.internal.k4y.o2n.class);
               if (var6 != null) {
                  if (var4.n5().n5() == 4 && var6.n5().c4() != null) {
                     e0p.n5(var4, var6.n5().c4().l6(), var3);
                  }

                  e0p.n5(var4, var6.n5().d2(), var3);
               }
            }
            break;
         default:
            throw new ArgumentOutOfRangeException(
               "nodeType", com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.k4y.t7.class, var0), "Not a general sequence"
            );
      }
   }

   private static void n5(IAnimationTimeLine var0, List<ISequence> var1, com.aspose.slides.internal.k4y.k8g var2, w3j var3) {
      try {
         n5(var0, var1);
         if (var2.u3() != null) {
            n5(var0, var1, var2.u3().n5(), var3);
         }
      } catch (RuntimeException var5) {
         throw new PptxException("reading animation group failed.", var5);
      }
   }

   private static void n5(IAnimationTimeLine var0, List<ISequence> var1) {
      List$Enumerator var2 = var1.iterator();

      try {
         while (var2.hasNext()) {
            Sequence var3 = (Sequence)var2.next();
            List$Enumerator var4 = var3.n5().u3().iterator();

            try {
               while (var4.hasNext()) {
                  IEffect var5 = (IEffect)var4.next();
                  Effect var6 = (Effect)var5;
                  if (var6.k5().n5() < 0) {
                     TextAnimation var7 = new TextAnimation();
                     var7.k5 = true;
                     var7.n5(var3);
                     var7.l6().n5().addItem(var6);
                     if (var6.k5().k5()) {
                        var7.l6().n5(var6);
                     }

                     var7.l6().n5(var6.k5().u3());
                     var7.k5();
                     ((AnimationTimeLine)var0).k5.n5(var7);
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
                  var4.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   private static void n5(IAnimationTimeLine var0, List<ISequence> var1, IGenericEnumerable<com.aspose.slides.internal.k4y.g7> var2, w3j var3) {
      IGenericEnumerator var4 = var2.iterator();

      try {
         while (var4.hasNext()) {
            com.aspose.slides.internal.k4y.g7 var5 = (com.aspose.slides.internal.k4y.g7)var4.next();
            switch (l6.n5(var5.n5())) {
               case 0:
                  com.aspose.slides.internal.k4y.m7f var31 = (com.aspose.slides.internal.k4y.m7f)var5.l6();
                  String var32 = var31.n5();
                  IShape var33 = null;
                  if (var3.n5().containsKey(var32)) {
                     var33 = (IShape)var3.n5().get_Item(var32);
                  }

                  long var9 = var31.l6();
                  Sequence var11 = null;
                  List$Enumerator var12 = var1.iterator();

                  try {
                     while (var12.hasNext()) {
                        Sequence var13 = (Sequence)var12.next();
                        IEffect[] var14 = var13.getEffectsByShape(var33);
                        if (var14.length > 0) {
                           var11 = var13;
                        }
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var12, IDisposable.class)) {
                        var12.dispose();
                     }
                  }

                  if (var11 == null) {
                     String var34 = com.aspose.slides.ms.System.d1.n5("No effects found for animation, id: {0}, groupId: {1}", var32, var9);
                     if (var3.l6() != null) {
                        var3.l6().n5(var34, 99);
                     } else if (var3.k5() != null) {
                        var3.k5().n5(var34, 99);
                     }
                  }

                  TextAnimation var35 = new TextAnimation();
                  var35.n5(var11);
                  int var36 = 0;
                  if (var35.n5() != null) {
                     IEffect[] var15 = var35.n5().getEffectsByShape(var33);
                     Effect var16 = (Effect)var15[0];
                     if (var31.u9()) {
                        var35.l6().n5(var16);
                     }

                     for (IEffect var20 : var15) {
                        Effect var21 = (Effect)var20;
                        if (var21.k5().n5() == (var9 & 4294967295L)) {
                           var35.l6().n5().addItem(var21);
                           if (var21.k5().t2() != null) {
                              var36++;
                           }
                        }
                     }

                     var35.l6().n5(var16.k5().u3());
                     if (var35.l6().n5().size() == 0) {
                        break;
                     }
                  } else {
                     var35.l6().n5(var33);
                  }

                  String var37 = var31.t2();
                  if (var37 == null) {
                     var37 = "indefinite";
                  }

                  String var38 = var37;
                  var35.l6().n5("indefinite".equals(var38) ? Integer.MIN_VALUE : com.aspose.slides.ms.System.Xml.f4.e2(var38));
                  var35.l6().n5(var31.c8());
                  label219:
                  switch (var31.u3()) {
                     case 1:
                        var35.n5 = 1;
                        break;
                     case 2:
                        long var22 = var31.a6();
                        switch ((int)var22) {
                           case 1:
                              var35.n5 = 2;
                              break label219;
                           case 2:
                              var35.n5 = 3;
                              break label219;
                           case 3:
                              var35.n5 = 4;
                              break label219;
                           case 4:
                              var35.n5 = 5;
                              break label219;
                           case 5:
                              var35.n5 = 6;
                           default:
                              break label219;
                        }
                     case 3:
                     case 4:
                        var35.n5 = 0;
                  }

                  ((AnimationTimeLine)var0).k5.n5(var35);
                  if (var36 > 0 && var35.l6().n5().size() == var36) {
                     var35.n5(var35.n5);
                  } else {
                     var35.k5();
                  }
                  break;
               case 1:
                  com.aspose.slides.internal.k4y.k8b var6 = (com.aspose.slides.internal.k4y.k8b)var5.l6();
                  if (var3.n5().containsKey(var6.n5())) {
                     ((Sequence)var0.getMainSequence()).n5().x8().addItem(var5);
                  }
                  break;
               case 2:
                  com.aspose.slides.internal.k4y.m0m var7 = (com.aspose.slides.internal.k4y.m0m)var5.l6();
                  if (var3.n5().containsKey(var7.n5())) {
                     ((Sequence)var0.getMainSequence()).n5().x8().addItem(var5);
                  }
                  break;
               case 3:
                  com.aspose.slides.internal.k4y.l0n var8 = (com.aspose.slides.internal.k4y.l0n)var5.l6();
                  if (var3.n5().containsKey(var8.n5())) {
                     ((Sequence)var0.getMainSequence()).n5().x8().addItem(var5);
                  }
                  break;
               default:
                  throw new Exception();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }
   }

   public static com.aspose.slides.internal.k4y.n0d n5(com.aspose.slides.internal.k4y.g7 var0) {
      if (!l6(var0.n5())) {
         return null;
      } else if ("par".equals(var0.n5())) {
         com.aspose.slides.internal.k4y.o2n var5 = com.aspose.slides.internal.v6g.k5.n5(var0.l6(), com.aspose.slides.internal.k4y.o2n.class);
         return var5.n5();
      } else if ("seq".equals(var0.n5())) {
         com.aspose.slides.internal.k4y.q3a var4 = com.aspose.slides.internal.v6g.k5.n5(var0.l6(), com.aspose.slides.internal.k4y.q3a.class);
         return var4.u9();
      } else if ("excl".equals(var0.n5())) {
         com.aspose.slides.internal.k4y.g8z var3 = com.aspose.slides.internal.v6g.k5.n5(var0.l6(), com.aspose.slides.internal.k4y.g8z.class);
         return var3.n5();
      } else if ("audio".equals(var0.n5())) {
         com.aspose.slides.internal.k4y.e3b var2 = com.aspose.slides.internal.v6g.k5.n5(var0.l6(), com.aspose.slides.internal.k4y.e3b.class);
         return var2.l6().a6();
      } else if ("video".equals(var0.n5())) {
         com.aspose.slides.internal.k4y.u3l var1 = com.aspose.slides.internal.v6g.k5.n5(var0.l6(), com.aspose.slides.internal.k4y.u3l.class);
         return var1.l6().a6();
      } else {
         throw new InvalidOperationException("CommonTimeNodeParent inconsistency");
      }
   }

   public static void n5(IAnimationTimeLine var0, IShapeCollection var1, com.aspose.slides.internal.k4y.k8g var2, d5t var3) {
      if (var2 == null) {
         throw new InvalidOperationException();
      }

      int var4 = 0;
      if (var0.getInteractiveSequences().getCount() == 0 && var0.getMainSequence().getCount() == 0) {
         IPresentation var5 = ((AnimationTimeLine)var0).n5().getPresentation();
         if (var5.getAudios().size() == 0 && var5.getVideos().size() == 0) {
            return;
         }
      }

      com.aspose.slides.internal.k4y.h7e var52 = var2.n5();
      com.aspose.slides.internal.k4y.o2n var6 = (com.aspose.slides.internal.k4y.o2n)var52.n5("par").l6();
      var6.n5().h0((byte)8);
      var6.n5().n5(++var4);
      var6.n5().k5((byte)-1);
      var6.n5().n5(n5(Float.POSITIVE_INFINITY));
      var6.n5().l6((byte)2);
      com.aspose.slides.internal.k4y.h7e var7 = var6.n5().a6();
      if (var0.getMainSequence().getCount() > 0) {
         int[] var8 = new int[]{1};
         e0p.n5((Sequence)var0.getMainSequence(), var1, var8, var7, var3);
         var4 = var8[0];
      }

      IGenericEnumerator var53 = var0.getInteractiveSequences().iterator();

      try {
         while (var53.hasNext()) {
            ISequence var9 = (ISequence)var53.next();
            int[] var10 = new int[]{var4};
            e0p.n5((Sequence)var9, var1, var10, var7, var3);
            var4 = var10[0];
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var53, IDisposable.class)) {
            var53.dispose();
         }
      }

      com.aspose.slides.internal.k4y.h5h var54 = var2.u3();
      var2.n5((com.aspose.slides.internal.k4y.h5h)null);
      var2.l6();
      if (var54 != null) {
         List$Enumerator var55 = var54.n5().iterator();

         try {
            while (var55.hasNext()) {
               com.aspose.slides.internal.k4y.g7 var11 = (com.aspose.slides.internal.k4y.g7)var55.next();
               if (!"bldP".equals(var11.n5())) {
                  var2.u3().n5(var11);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var55, IDisposable.class)) {
               var55.dispose();
            }
         }
      }

      int var56 = 0;
      IGenericEnumerator var57 = var0.getTextAnimationCollection().iterator();

      try {
         while (var57.hasNext()) {
            TextAnimation var12 = (TextAnimation)var57.next();
            if (var12.l6().n5().size() != 0) {
               boolean var13 = false;
               List$Enumerator var14 = var12.l6().n5().iterator();

               try {
                  while (var14.hasNext()) {
                     Effect var15 = (Effect)var14.next();
                     var13 = var15.k5().h0() == null;
                     if (!var13 && var15.n5() != null && var15.l6() != null) {
                        var13 = var15.n5().x8() == null || var15.l6().x8() == null;
                     }

                     if (var13) {
                        break;
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
                     var14.dispose();
                  }
               }

               if (!var13) {
                  n5(var12, var56);
                  if (!var12.k5) {
                     if (var2.u3() == null) {
                        throw new PptxException("Internal error: animation build list is not initialized");
                     }

                     com.aspose.slides.internal.k4y.m7f var62 = (com.aspose.slides.internal.k4y.m7f)var2.u3().n5("bldP").l6();
                     if (var12.l6().a6() != null) {
                        var62.n5(n5(var12.l6().a6()));
                     }

                     Effect var16 = (Effect)var12.l6().n5().get_Item(0);
                     var62.n5(var16.k5().n5() > -1 ? var16.k5().n5() & 4294967295L : var56 & 4294967295L);
                     var62.n5(var12.l6().n5().size() > 1);
                     var62.l6(
                        var12.l6().k5() == Integer.MIN_VALUE
                           ? "indefinite"
                           : com.aspose.slides.ms.System.a3.n5(var12.l6().k5(), com.aspose.slides.internal.x7n.l6.k5())
                     );
                     var62.k5(var12.l6().u3());
                     byte var17 = 3;
                     switch (var12.getBuildType()) {
                        case 0:
                           var17 = 4;
                           break;
                        case 1:
                           var17 = 1;
                           break;
                        case 2:
                           var17 = 2;
                           var62.l6(1L);
                           break;
                        case 3:
                           var17 = 2;
                           var62.l6(2L);
                           break;
                        case 4:
                           var17 = 2;
                           var62.l6(3L);
                           break;
                        case 5:
                           var17 = 2;
                           var62.l6(4L);
                           break;
                        case 6:
                           var17 = 2;
                           var62.l6(5L);
                     }

                     var62.n5(var17);
                     var62.l6(var12.l6().l6() != null);
                     var56++;
                  }
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var57, IDisposable.class)) {
            var57.dispose();
         }
      }

      List$Enumerator var58 = ((Sequence)var0.getMainSequence()).n5().x8().iterator();

      try {
         while (var58.hasNext()) {
            com.aspose.slides.internal.k4y.g7 var59 = (com.aspose.slides.internal.k4y.g7)var58.next();
            String var61 = null;
            switch (l6.n5(var59.n5())) {
               case 1:
                  com.aspose.slides.internal.k4y.k8b var63 = com.aspose.slides.internal.v6g.k5.n5(var59.l6(), com.aspose.slides.internal.k4y.k8b.class);
                  var61 = var63.n5();
                  break;
               case 2:
                  com.aspose.slides.internal.k4y.m0m var64 = com.aspose.slides.internal.v6g.k5.n5(var59.l6(), com.aspose.slides.internal.k4y.m0m.class);
                  var61 = var64.n5();
                  break;
               case 3:
                  com.aspose.slides.internal.k4y.l0n var65 = com.aspose.slides.internal.v6g.k5.n5(var59.l6(), com.aspose.slides.internal.k4y.l0n.class);
                  var61 = var65.n5();
            }

            if (!com.aspose.slides.ms.System.d1.n5(var61) && var3.n5(com.aspose.slides.ms.System.Xml.f4.q0(var61))) {
               var2.u3().n5(var59);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var58, IDisposable.class)) {
            var58.dispose();
         }
      }

      if (var2.u3().n5().size() == 0) {
         var2.n5((com.aspose.slides.internal.k4y.h5h)null);
      }

      int[] var60 = new int[]{var4};
      n5(var1, var60, var7, var3);
      var4 = var60[0];
      if (var7.n5().size() == 0) {
         var2.n5((com.aspose.slides.internal.k4y.h7e)null);
      }
   }

   private static void n5(TextAnimation var0, int var1) {
      List$Enumerator var2 = var0.l6().n5().iterator();

      try {
         while (var2.hasNext()) {
            Effect var3 = (Effect)var2.next();
            if (!var0.k5) {
               if (var3.k5().n5() == -1) {
                  var3.k5().h0().n5().k5(var1 & 4294967295L);
               }

               if (var0.n5 == 0) {
                  continue;
               }
            }

            n5(var3, var3.k5().h0().n5().d2());
            n5(var3, var3.k5().h0().n5().d5());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   private static void n5(Effect var0, com.aspose.slides.internal.k4y.h7e var1) {
      if (var1 != null) {
         List$Enumerator var2 = var1.n5().iterator();

         try {
            while (var2.hasNext()) {
               com.aspose.slides.internal.k4y.g7 var3 = (com.aspose.slides.internal.k4y.g7)var2.next();
               com.aspose.slides.internal.k4y.u2q var4 = l6(var3);
               if (var4 != null && !var0.k5().k5()) {
                  com.aspose.slides.internal.k4y.h1f var5 = com.aspose.slides.internal.v6g.k5.n5(var4.h0().n5().l6(), com.aspose.slides.internal.k4y.h1f.class);
                  if (var5 != null && var5.l6() == null) {
                     if (var0.n5() != null && var0.l6() != null) {
                        com.aspose.slides.internal.k4y.t4n var11 = (com.aspose.slides.internal.k4y.t4n)var5.n5("txEl").l6();
                        com.aspose.slides.internal.k4y.v6b var12 = (com.aspose.slides.internal.k4y.v6b)var11.n5("pRg").l6();
                        var12.n5(var0.n5().h0() & 4294967295L);
                        var12.l6(var0.l6().h0() & 4294967295L);
                     } else if (var0.k5().t2() != null) {
                        com.aspose.slides.internal.k4y.t4n var6 = (com.aspose.slides.internal.k4y.t4n)var5.n5("txEl").l6();
                        com.aspose.slides.internal.k4y.v6b var7 = (com.aspose.slides.internal.k4y.v6b)var6.n5("charRg").l6();
                        var7.n5(var0.k5().t2().n5());
                        var7.l6(var0.k5().t2().l6());
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

   private static void n5(IShapeCollection var0, int[] var1, com.aspose.slides.internal.k4y.h7e var2, d5t var3) {
      if (var0 != null) {
         IGenericEnumerator var4 = var0.iterator();

         try {
            while (var4.hasNext()) {
               IShape var5 = (IShape)var4.next();
               IGroupShape var6 = com.aspose.slides.internal.v6g.k5.n5(var5, IGroupShape.class);
               if (var6 != null) {
                  n5(var6.getShapes(), var1, var2, var3);
               } else {
                  IAudioFrame var7 = com.aspose.slides.internal.v6g.k5.n5(var5, IAudioFrame.class);
                  if (var7 != null) {
                     if (!n5(var5, var2, var3)) {
                        com.aspose.slides.internal.k4y.e3b var8 = (com.aspose.slides.internal.k4y.e3b)var2.n5("audio").l6();
                        o5f.n5(var8, var7, ++var1[0], ((AudioFrame)var7).v4());
                     }

                     var3.n5(true);
                  } else {
                     VideoFrame var13 = com.aspose.slides.internal.v6g.k5.n5(var5, VideoFrame.class);
                     if (var13 != null && !n5(var5, var2, var3)) {
                        com.aspose.slides.internal.k4y.u3l var9 = (com.aspose.slides.internal.k4y.u3l)var2.n5("video").l6();
                        o5f.n5(var9, var13, ++var1[0], var13.v4());
                     }
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }
      }
   }

   private static boolean n5(IShape var0, com.aspose.slides.internal.k4y.h7e var1, d5t var2) {
      long var3 = 0L;
      Long[] var5 = new Long[]{var3};
      boolean var6 = var2.n5().tryGetValue(var0, var5);
      var3 = var5[0];
      if (var6) {
         List$Enumerator var7 = var1.n5().iterator();

         try {
            while (var7.hasNext()) {
               com.aspose.slides.internal.k4y.g7 var8 = (com.aspose.slides.internal.k4y.g7)var7.next();
               com.aspose.slides.internal.k4y.e3b var9 = com.aspose.slides.internal.v6g.k5.n5(var8.l6(), com.aspose.slides.internal.k4y.e3b.class);
               if (var9 != null) {
                  if (n5(var9.l6(), com.aspose.slides.ms.System.Xml.f4.l6(var3))) {
                     return true;
                  }
               } else {
                  com.aspose.slides.internal.k4y.u3l var10 = com.aspose.slides.internal.v6g.k5.n5(var8.l6(), com.aspose.slides.internal.k4y.u3l.class);
                  if (var10 != null && n5(var10.l6(), com.aspose.slides.ms.System.Xml.f4.l6(var3))) {
                     return true;
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
               var7.dispose();
            }
         }
      }

      return false;
   }

   private static boolean n5(com.aspose.slides.internal.k4y.c7e var0, String var1) {
      if (var0 == null) {
         return false;
      }

      com.aspose.slides.internal.k4y.s2a var2 = var0.u9();
      if (var2 == null) {
         return false;
      }

      if (var2.n5() == null) {
         return false;
      }

      com.aspose.slides.internal.k4y.h1f var3 = com.aspose.slides.internal.v6g.k5.n5(var2.n5().l6(), com.aspose.slides.internal.k4y.h1f.class);
      return var3 == null ? false : com.aspose.slides.ms.System.d1.a6(var3.n5(), var1);
   }

   static String n5(float var0) {
      return com.aspose.slides.ms.System.n1.a6(var0)
         ? "indefinite"
         : com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(var0 * 1000.0F), 14));
   }

   static float n5(String var0) {
      if (var0 == null) {
         return Float.NaN;
      } else {
         return "indefinite".equals(var0) ? Float.POSITIVE_INFINITY : (float)com.aspose.slides.ms.System.Xml.f4.t9(var0) / 1000.0F;
      }
   }

   static void n5(com.aspose.slides.internal.k4y.c5h var0, com.aspose.slides.internal.o9b.w1 var1) {
      var0.n5(var1.l6());
      var0.l6(var1.k5());
   }

   static com.aspose.slides.internal.k4y.u2q l6(com.aspose.slides.internal.k4y.g7 var0) {
      com.aspose.slides.internal.k4y.u2q var1 = null;
      com.aspose.slides.internal.k4y.b3 var2 = var0.l6();
      if (com.aspose.slides.internal.v6g.k5.l6(var2, com.aspose.slides.internal.k4y.s5v.class)) {
         var1 = ((com.aspose.slides.internal.k4y.s5v)var2).u9();
      } else if (com.aspose.slides.internal.v6g.k5.l6(var2, com.aspose.slides.internal.k4y.s1z.class)) {
         var1 = ((com.aspose.slides.internal.k4y.s1z)var2).k5();
      } else if (com.aspose.slides.internal.v6g.k5.l6(var2, com.aspose.slides.internal.k4y.n3m.class)) {
         var1 = ((com.aspose.slides.internal.k4y.n3m)var2).u3();
      } else if (com.aspose.slides.internal.v6g.k5.l6(var2, com.aspose.slides.internal.k4y.h7g.class)) {
         var1 = ((com.aspose.slides.internal.k4y.h7g)var2).s7();
      } else if (com.aspose.slides.internal.v6g.k5.l6(var2, com.aspose.slides.internal.k4y.a4w.class)) {
         var1 = ((com.aspose.slides.internal.k4y.a4w)var2).h0();
      } else if (com.aspose.slides.internal.v6g.k5.l6(var2, com.aspose.slides.internal.k4y.c3t.class)) {
         var1 = ((com.aspose.slides.internal.k4y.c3t)var2).u3();
      } else if (com.aspose.slides.internal.v6g.k5.l6(var2, com.aspose.slides.internal.k4y.q6i.class)) {
         var1 = ((com.aspose.slides.internal.k4y.q6i)var2).a6();
      } else if (com.aspose.slides.internal.v6g.k5.l6(var2, com.aspose.slides.internal.k4y.p2j.class)) {
         var1 = ((com.aspose.slides.internal.k4y.p2j)var2).l6();
      }

      return var1;
   }

   static String n5(IShape var0) {
      return com.aspose.slides.ms.System.Xml.f4.l6(((Shape)var0).h0().z3());
   }

   static long l6(IShape var0) {
      return ((Shape)var0).h0().z3();
   }

   static int n5(IAutoShape var0, long var1) {
      int var3 = 0;
      int var4 = 0;
      IGenericEnumerator var5 = var0.getTextFrame().getParagraphs().iterator();

      try {
         while (var5.hasNext()) {
            IParagraph var6 = (IParagraph)var5.next();
            if (var4 == (var1 & 4294967295L)) {
               return var3;
            }

            if (!com.aspose.slides.ms.System.d1.n5(var6.getText())) {
               var3 += var6.getText().length();
            }

            var3++;
            var4++;
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      return -1;
   }

   static int l6(IAutoShape var0, long var1) {
      int var3 = 0;
      int var4 = 0;
      IGenericEnumerator var5 = var0.getTextFrame().getParagraphs().iterator();

      try {
         while (var5.hasNext()) {
            IParagraph var6 = (IParagraph)var5.next();
            int var7 = var4 + 1;
            if (!com.aspose.slides.ms.System.d1.n5(var6.getText())) {
               var7 += var6.getText().length();
            }

            if (var3 == (var1 & 4294967295L)) {
               return var7;
            }

            var4 = var7;
            var3++;
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      return -1;
   }

   public static boolean l6(String var0) {
      return n5.containsItem(var0);
   }

   static void n5(com.aspose.slides.internal.k4y.g7 var0, long[] var1) {
      if (l6(var0.n5())) {
         com.aspose.slides.internal.k4y.n0d var2 = n5(var0);
         if (var2 == null) {
            throw new PptxReadException("TimeLine.TNid, error reading slide.");
         }

         var1[0] = var2.u9() & 4294967295L;
         if (var2.d2() != null && var2.d2().n5() != null) {
            List$Enumerator var3 = var2.d2().n5().iterator();

            try {
               while (var3.hasNext()) {
                  com.aspose.slides.internal.k4y.g7 var4 = (com.aspose.slides.internal.k4y.g7)var3.next();
                  n5(var4, var1);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
                  var3.dispose();
               }
            }
         }
      }
   }

   static long n5(Slide var0) {
      long var1 = 0L;
      com.aspose.slides.internal.k4y.k8g var3 = var0.q0().n5();
      if (var3 != null && var3.k5() != null && var3.k5().n5() != null) {
         List$Enumerator var4 = var3.k5().n5().iterator();

         try {
            while (var4.hasNext()) {
               com.aspose.slides.internal.k4y.g7 var5 = (com.aspose.slides.internal.k4y.g7)var4.next();
               long[] var6 = new long[]{var1};
               n5(var5, var6);
               var1 = var6[0];
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }

         return var1;
      } else {
         return var1;
      }
   }

   static {
      n5.addItem("par");
      n5.addItem("seq");
      n5.addItem("excl");
      n5.addItem("audio");
      n5.addItem("video");
   }
}
