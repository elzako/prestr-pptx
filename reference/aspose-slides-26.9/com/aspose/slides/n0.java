package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$KeyCollection$Enumerator;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.ms.System.IDisposable;
import java.util.Arrays;

class n0 {
   static void n5(t2s var0) {
      u3(var0);
      a6(var0);
      u9(var0);
      w3p.n5(var0);
      h0(var0);
      c8(var0);
      u5b.n5(var0.y4().getCustomData(), var0.q0());
      l6(var0);
      a5n.n5(var0);
      k5(var0);
   }

   private static void k5(t2s var0) {
      BaseSlide var1 = var0.y4();

      try {
         com.aspose.slides.internal.k4y.g2 var2 = new com.aspose.slides.internal.k4y.g2();
         s4n.n5(var2, var0);
         x2.n5(var2, var0);
         w3j var3 = new w3j(var0.a6(), n5(var0, false));
         o5.n5(var1.getTimeline(), var2.s7(), var3);
         if (var2.s7() == null && var0.z8().size() > 0) {
            SortedList var51 = new SortedList();
            List var53 = new List();
            Dictionary$KeyCollection$Enumerator var54 = var0.z8().getKeys().iterator();

            try {
               while (var54.hasNext()) {
                  IShape var55 = (IShape)var54.next();
                  com.aspose.slides.internal.k0r.n5 var8 = var0.z8().get_Item(var55).l6();
                  if (var51.containsKey(Integer.valueOf(var8.c8()))) {
                     var53.addItem(var55);
                  } else {
                     var51.addItem(Integer.valueOf(var8.c8()), var55);
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var54, IDisposable.class)) {
                  var54.dispose();
               }
            }

            int var56 = 0;
            IGenericEnumerator var57 = var51.getKeys().iterator();

            try {
               while (var57.hasNext()) {
                  int var9 = com.aspose.slides.internal.v6g.k5.u3(var57.next(), int.class);
                  if (var56 < var9) {
                     var56 = var9;
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var57, IDisposable.class)) {
                  var57.dispose();
               }
            }

            List$Enumerator var58 = var53.iterator();

            try {
               while (var58.hasNext()) {
                  IShape var10 = (IShape)var58.next();
                  var51.addItem(++var56, var10);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var58, IDisposable.class)) {
                  var58.dispose();
               }
            }

            int var59 = 0;
            IGenericEnumerator var11 = var51.getKeys().iterator();

            try {
               while (var11.hasNext()) {
                  int var12 = com.aspose.slides.internal.v6g.k5.u3(var11.next(), int.class);
                  IShape var13 = (IShape)var51.get_Item(var12);
                  u8j.n5(var13, var1.getTimeline(), var0.z8().get_Item(var13).l6(), var59, var0.a6());
                  var59++;
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var11, IDisposable.class)) {
                  var11.dispose();
               }
            }
         } else if (var1.getTimeline().getMainSequence().getCount() == 0 && var1.getTimeline().getInteractiveSequences().getCount() == 0) {
            com.aspose.slides.internal.k0r.o8 var4 = com.aspose.slides.internal.v6g.k5.n5(var0.s7(), com.aspose.slides.internal.k0r.o8.class);
            if (var4 != null && var4.m1() != null && var4.z3() != null) {
               try {
                  com.aspose.slides.internal.c8m.t6 var5 = new com.aspose.slides.internal.c8m.t6(
                     new com.aspose.slides.internal.z0k.e2(var4.m1().u3()), new n0$1(var0)
                  );
                  if (var5 != null && var5.m1() != null) {
                     com.aspose.slides.internal.z0k.e2 var6 = new com.aspose.slides.internal.z0k.e2(var5.m1().a6());
                     com.aspose.slides.ms.System.Xml.p5 var7 = new com.aspose.slides.ms.System.Xml.p5(var6);
                     var7.n5((com.aspose.slides.ms.System.Xml.o8)null);
                     var2 = new com.aspose.slides.internal.k4y.g2(var7);
                     var3 = new w3j(var0.a6(), n5(var0, true));
                     o5.n5(var1.getTimeline(), var2.s7(), var3);
                  }
               } catch (RuntimeException var43) {
               }
            }
         }

         if (var2.s7() != null) {
            o8 var52 = var1.k5();
            var52.n5(var2.s7().u3());
            var52.n5(var2.s7().a6());
            var52.n5(var2.s7());
         }
      } catch (InvalidOperationException var48) {
         var0.a6().n5("Loading of the animation info failed.", 1);
         com.aspose.slides.internal.n8e.v4.n5(var48);
         n5(var1.getTimeline());
      } catch (NotImplementedException var49) {
         var0.a6().n5("Loading of the animation info failed.", 1);
         com.aspose.slides.internal.n8e.v4.n5(var49);
         n5(var1.getTimeline());
      }
   }

   private static void n5(IAnimationTimeLine var0) {
      var0.getMainSequence().clear();
   }

   private static SortedList<String, ISlideComponent> n5(t2s var0, boolean var1) {
      SortedList var2 = new SortedList(var0.k7().size());
      IGenericEnumerator var3 = var0.k7().iterator();

      try {
         while (var3.hasNext()) {
            v5s var4 = (v5s)var3.next();
            n5(var4, var2, var1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return var2;
   }

   private static void n5(v5s var0, SortedList<String, ISlideComponent> var1, boolean var2) {
      if (var0.z1()) {
         if (var2 && (var0.s7() & 4294967295L) > 0L) {
            String var9 = com.aspose.slides.ms.System.l4.n5(var0.s7(), com.aspose.slides.internal.x7n.l6.k5());
            if (!var1.containsKey(var9)) {
               var1.addItem(var9, var0.a6().m1());
            }
         } else {
            String var3 = com.aspose.slides.ms.System.l4.n5(var0.t2(), com.aspose.slides.internal.x7n.l6.k5());
            if (!var1.containsKey(var3)) {
               var1.addItem(var3, var0.a6().m1());
            }
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var0.a6(), i1w.class)) {
            List$Enumerator var4 = ((i1w)var0.a6()).u9().iterator();

            try {
               while (var4.hasNext()) {
                  v5s var5 = (v5s)var4.next();
                  n5(var5, var1, var2);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
                  var4.dispose();
               }
            }
         }
      }
   }

   private static void u3(t2s var0) {
      if (var0.x8() != null) {
         if (var0.n3() > 1 && var0.n3() != 7 && var0.n3() != 5) {
            var0.y4().setShowMasterShapes(var0.x8().l6());
         }

         if (com.aspose.slides.internal.v6g.k5.n5(var0.y4(), Slide.class) != null) {
            ((Slide)var0.y4()).z3().l6(var0.x8().k5());
         }

         if (com.aspose.slides.internal.v6g.k5.n5(var0.y4(), LayoutSlide.class) != null) {
            ((LayoutSlide)var0.y4()).q0().l6(var0.x8().k5());
         }
      }
   }

   private static void a6(t2s var0) {
      switch (var0.n3()) {
         case 0:
         case 1:
            r7x.n5(var0);
            break;
         case 2:
         case 3:
         case 4:
         case 6:
         default:
            r7x.k5(var0);
            break;
         case 5:
         case 7:
            r7x.l6(var0);
      }

      e5e.l6(var0);
      var0.n5();
   }

   private static void u9(t2s var0) {
      f1 var1 = var0.y4().u3();
      com.aspose.slides.internal.k0r.l7h var2 = var0.s7().a6();
      if (var2 != null) {
         if (var2.u3() != null) {
            var1.n5(var2.u3().l6());
            var1.n5(var2.u3().a6());
            var1.n5(var2.u3().u9());
            var1.n5(var2.u3().h0());
            var1.n5(var2.u3().c8());
            var1.n5(var2.u3().t2());
            var1.n5(var2.u3().x8());
            n5(var0.y4(), var2.u3().u3(), var0.a6().n5());
         }

         if (var2.a6() != null) {
            var1.n5(var2.a6().l6());
         }
      }
   }

   private static void h0(t2s var0) {
      m5n var1 = var0.z1();
      if (var1 != null) {
         r6.n5(var1);
         BaseSlide var2 = var0.y4();
         if (var2.getBackground() != null && var0.x8() != null && var0.x8().u3()) {
            var2.getBackground().setType((byte)-1);
         }
      }
   }

   private static void c8(t2s var0) {
      com.aspose.slides.internal.k0r.r2 var1 = var0.z3();
      if (var1 != null) {
         List$Enumerator var2 = var1.e2().iterator();

         try {
            while (var2.hasNext()) {
               com.aspose.slides.internal.k0r.e6r var3 = (com.aspose.slides.internal.k0r.e6r)var2.next();
               com.aspose.slides.internal.k0r.s6 var4 = com.aspose.slides.internal.v6g.k5.n5(var3, com.aspose.slides.internal.k0r.s6.class);
               if (var4 != null && var0.m3().containsKey(var4.u3()) && var0.m3().get_Item(var4.u3()).z1()) {
                  Connector var5 = com.aspose.slides.internal.v6g.k5.n5(var0.m3().get_Item(var4.u3()).a6().m1(), Connector.class);
                  if (var5 != null) {
                     if (var5.getStartShapeConnectedTo() == null && (var4.l6() & 4294967295L) > 0L && var0.m3().containsKey(var4.l6())) {
                        v5s var6 = var0.m3().get_Item(var4.l6());
                        if (var6.c8() == 8 || var6.c8() == 6) {
                           continue;
                        }

                        IShape var7 = com.aspose.slides.internal.v6g.k5.n5(var6.a6().m1(), IShape.class);
                        if (var7 != null && var7.getConnectionSiteCount() > 0) {
                           var5.n5(var7);
                           if (var4.a6() > 0 && var4.a6() < var7.getConnectionSiteCount()) {
                              var5.n5(var4.a6() & 4294967295L);
                           }
                        }
                     }

                     if (var5.getEndShapeConnectedTo() == null && (var4.k5() & 4294967295L) > 0L && var0.m3().containsKey(var4.k5())) {
                        v5s var11 = var0.m3().get_Item(var4.k5());
                        if (var11.c8() == 8 || var11.c8() == 6) {
                           continue;
                        }

                        IShape var12 = com.aspose.slides.internal.v6g.k5.n5(var11.a6().m1(), IShape.class);
                        if (var12 != null && var12.getConnectionSiteCount() > 0) {
                           var5.l6(var12);
                           if (var4.u9() > 0 && var4.u9() < var12.getConnectionSiteCount()) {
                              var5.l6(var4.u9() & 4294967295L);
                           }
                        }
                     }

                     var5.k5();
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

   private static void n5(BaseSlide var0, com.aspose.slides.internal.k0r.z8[] var1, Presentation var2) {
      if (var1 != null) {
         if (var1.length >= 1) {
            ISlide var3 = (ISlide)var0;
            if (var3 != null) {
               ICommentAuthorCollection var4 = var2.getCommentAuthors();

               for (com.aspose.slides.internal.k0r.z8 var8 : var1) {
                  ICommentAuthor[] var9 = var4.findByNameAndInitials(var8.l6(), var8.a6());
                  ICommentAuthor var10;
                  if (var9.length > 0) {
                     var10 = var9[0];
                  } else {
                     var9 = var4.findByNameAndInitials(var8.l6(), com.aspose.slides.ms.System.d1.n5);
                     if (var9.length > 0) {
                        var10 = var9[0];
                        var10.setInitials(var8.a6());
                     } else {
                        var10 = var4.addAuthor(var8.l6(), var8.a6());
                     }
                  }

                  com.aspose.slides.internal.o9b.w1 var11 = new com.aspose.slides.internal.o9b.w1(var8.u9().k5().n5() / 8.0F, var8.u9().k5().l6() / 8.0F);
                  ((CommentCollection)var10.getComments()).n5(var8.u3(), (ISlide)var0, var11.u3(), var8.u9().l6().m3());
               }
            }
         }
      }
   }

   static void l6(t2s var0) {
      BaseSlide var1 = var0.y4();
      SortedList var2 = new SortedList();
      var2.addItem(var1.k5.v4(), var1.k5);
      List var3 = new List();
      n5(var1.k5.getShapes(), var2, var3);
      long var4 = 0L;
      IGenericEnumerator var6 = var2.getKeys().iterator();

      try {
         while (var6.hasNext()) {
            long var7 = com.aspose.slides.internal.v6g.k5.u3(var6.next(), long.class);
            if ((var4 & 4294967295L) < (var7 & 4294967295L)) {
               var4 = var7;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }

      var1.n5((var4 & 4294967295L) + 1L & 4294967295L, false);
      List$Enumerator var10 = var3.iterator();

      try {
         while (var10.hasNext()) {
            Shape var11 = (Shape)var10.next();
            var11.u3(var1.s7());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var10, IDisposable.class)) {
            var10.dispose();
         }
      }

      var1.l6.n5(var1);
   }

   private static void n5(IShapeCollection var0, SortedList<Long, Shape> var1, List<Shape> var2) {
      IGenericEnumerator var3 = var0.iterator();

      try {
         while (var3.hasNext()) {
            Shape var4 = (Shape)var3.next();
            if (!var1.containsKey(var4.v4())) {
               var1.addItem(var4.v4(), var4);
            } else {
               var2.addItem(var4);
            }

            var1.set_Item(var4.v4(), var4);
            if (com.aspose.slides.internal.v6g.k5.l6(var4, GroupShape.class)) {
               n5(((GroupShape)var4).getShapes(), var1, var2);
            }

            if (com.aspose.slides.internal.v6g.k5.l6(var4, LegacyDiagram.class)) {
               n5(((LegacyDiagram)var4).k5().getShapes(), var1, var2);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   static void n5(y2q var0) {
      r7x.n5(var0);
      l6(var0);
      r7x.l6(var0);
      e5e.l6(var0);
      s7(var0);
   }

   private static void l6(y2q var0) {
      g6o var1 = var0.n5();
      var1.y1();
      com.aspose.slides.internal.k0r.l1 var2 = var0.a6();
      com.aspose.slides.internal.k0r.b7 var3 = var2.l6();
      var1.n5(var3);
      var3.n5((int)(var1.a0() & 65535L));
      n6s var4 = var0.u9();
      var4.m3().n5(var0.n5(false));
      boolean var5 = var0.k5() == 3;
      var5 &= var0.l6().getShowMasterShapes();
      var5 &= com.aspose.slides.internal.v6g.k5.n5(var0.u3(), com.aspose.slides.internal.k0r.u6p.class) != null;
      var5 |= var0.k5() == 2;
      LayoutSlide var6 = null;
      if (var5) {
         var6 = com.aspose.slides.internal.v6g.k5.n5(var0.l6(), LayoutSlide.class);
         var4.n5(((MasterSlide)var6.getMasterSlide()).k5);
      } else {
         var4.n5(var0.l6().k5);
      }

      if (var6 != null) {
         List$Enumerator var7 = var0.t2().iterator();

         try {
            while (var7.hasNext()) {
               k1z var8 = (k1z)var7.next();
               if (var8.k7() != null) {
                  var8.k7().n5(true);
               } else {
                  var8.n5(var8.h0() & var6.getShowMasterShapes());
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
               var7.dispose();
            }
         }

         var4.n5(var6.k5);
      }

      var4.c8();
      y3o.k5(var0);
      r6.n5(var0);
      k5(var0);
      t2(var0);
      if (var0.n5().z8()) {
         l6(var4);
      }

      n5(var4.x8(), var0);
      n5(var4);
   }

   private static void n5(com.aspose.slides.internal.k0r.e4 var0, y2q var1) {
      int var2 = var0.e2().size();
      int var3 = 1;

      while (var3 < var2) {
         com.aspose.slides.internal.k0r.e4 var4 = com.aspose.slides.internal.v6g.k5.n5(var0.e2().get_Item(var3), com.aspose.slides.internal.k0r.e4.class);
         if (var4 != null) {
            var4.u3().n5(var1.n5(false));
            n5(var4, var1);
            var3++;
         } else {
            com.aspose.slides.internal.k0r.q5 var5 = com.aspose.slides.internal.v6g.k5.n5(var0.e2().get_Item(var3), com.aspose.slides.internal.k0r.q5.class);
            if (var5 != null) {
               var5.u3().n5(var1.n5(true));
            }

            var3++;
         }
      }
   }

   private static void k5(y2q var0) {
      List var1 = new List();
      u3(var0);
      a6(var0);
      h0(var0);
      x8(var0);
      y2q var2 = var0.n5(0);
      List$Enumerator var3 = var0.t2().iterator();

      try {
         while (var3.hasNext()) {
            k1z var4 = (k1z)var3.next();
            var0.n5().e2().throwIfInterruptionRequested();
            if (var4.h0()) {
               if (var4.d2()) {
                  var1.addItem(var4);
               }

               n5(var4);
               if (var4.k7() == null) {
                  if (var0.t4()) {
                     var0.n5(var4);
                  }

                  if (var0.k5() == 2 && var2.c8().containsKey(var4.s7())) {
                     com.aspose.slides.internal.k0r.c9 var5 = var2.c8().get_Item(var4.s7()).w1();
                     var4.w1().n5(var5.q0());
                     var4.w1().n5(var5.z1());
                  }
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      List$Enumerator var21 = var1.iterator();

      try {
         while (var21.hasNext()) {
            k1z var22 = (k1z)var21.next();
            var22.e2();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var21, IDisposable.class)) {
            var21.dispose();
         }
      }

      c8(var0);
      List$Enumerator var23 = var0.t2().iterator();

      try {
         while (var23.hasNext()) {
            k1z var6 = (k1z)var23.next();
            if (var6.h0()) {
               var6.c8();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var23, IDisposable.class)) {
            var23.dispose();
         }
      }
   }

   private static void u3(y2q var0) {
      if (var0.k5() == 3 || var0.k5() == 2) {
         if (!var0.m3()) {
            boolean var1 = var0.r4();
            int var2 = var0.t9().size();
            List var3 = new List();
            List var4 = new List();

            for (int var5 = 0; var5 < var2; var5++) {
               z4m var6 = var0.t9().get_Item(var5);
               var6.l6().n5(!(var1 ^ var6.c8()));
               if (v0q.n5(var6.k5())) {
                  var6.l6().n5(!var6.c8());
               }

               String var7 = "";
               AutoShape var8 = com.aspose.slides.internal.v6g.k5.n5(var6.l6().s7(), AutoShape.class);
               if (var8 != null && var8.getTextFrame() != null) {
                  var7 = var8.getTextFrame().getText();
               }

               if (var6.c8()) {
                  var3.addItem(var6);
               } else {
                  var4.addItem(var6);
               }
            }

            if (var1) {
               List$Enumerator var57 = var3.iterator();

               try {
                  while (var57.hasNext()) {
                     z4m var59 = (z4m)var57.next();
                     if (v0q.n5(var59.k5())) {
                        List$Enumerator var63 = var4.iterator();

                        try {
                           while (var63.hasNext()) {
                              z4m var67 = (z4m)var63.next();
                              if (var67.k5().getType() == var59.k5().getType()) {
                                 var59.l6().n5(false);
                                 var67.l6().n5(true);
                                 var67.n5(var59.l6());
                                 break;
                              }
                           }
                        } finally {
                           if (com.aspose.slides.internal.v6g.k5.n5(var63, IDisposable.class)) {
                              var63.dispose();
                           }
                        }
                     } else {
                        List$Enumerator var62 = var4.iterator();

                        try {
                           while (var62.hasNext()) {
                              z4m var66 = (z4m)var62.next();
                              if (var66.k5().getIndex() == var59.k5().getIndex()) {
                                 var59.l6().n5(true);
                                 var66.l6().n5(false);
                                 var59.n5(var66.l6());
                                 break;
                              }
                           }
                        } finally {
                           if (com.aspose.slides.internal.v6g.k5.n5(var62, IDisposable.class)) {
                              var62.dispose();
                           }
                        }
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var57, IDisposable.class)) {
                     var57.dispose();
                  }
               }
            } else {
               List$Enumerator var58 = var3.iterator();

               try {
                  while (var58.hasNext()) {
                     z4m var60 = (z4m)var58.next();
                     if (v0q.n5(var60.k5())) {
                        var60.l6().n5(false);
                        List$Enumerator var65 = var4.iterator();

                        try {
                           while (var65.hasNext()) {
                              z4m var69 = (z4m)var65.next();
                              if (var60.k5().getType() == var69.k5().getType()) {
                                 var69.l6().n5(true);
                                 break;
                              }
                           }
                        } finally {
                           if (com.aspose.slides.internal.v6g.k5.n5(var65, IDisposable.class)) {
                              var65.dispose();
                           }
                        }
                     } else {
                        List$Enumerator var64 = var4.iterator();

                        try {
                           while (var64.hasNext()) {
                              z4m var68 = (z4m)var64.next();
                              if (var60.k5().getIndex() == var68.k5().getIndex()) {
                                 var60.l6().n5(false);
                                 var68.l6().n5(true);
                                 break;
                              }
                           }
                        } finally {
                           if (com.aspose.slides.internal.v6g.k5.n5(var64, IDisposable.class)) {
                              var64.dispose();
                           }
                        }
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var58, IDisposable.class)) {
                     var58.dispose();
                  }
               }
            }
         }
      }
   }

   private static void a6(y2q var0) {
      Dictionary var1 = new Dictionary();
      List var2 = new List();
      List$Enumerator var3 = var0.t9().iterator();

      try {
         while (var3.hasNext()) {
            z4m var4 = (z4m)var3.next();
            if (var4.l6().h0()) {
               byte var5 = -1;
               switch (var4.k5().getType()) {
                  case 4:
                     var5 = 2;
                     break;
                  case 5:
                     var5 = 4;
                     break;
                  case 6:
                     var5 = 3;
                     break;
                  case 7:
                     var5 = 0;
               }

               if (var5 < 0) {
                  switch (var4.a6()) {
                     case 1:
                     case 3:
                     case 13:
                     case 15:
                     case 17:
                        var5 = 0;
                        break;
                     case 2:
                     case 4:
                     case 6:
                     case 12:
                     case 14:
                     case 18:
                        var5 = 1;
                     case 5:
                     case 7:
                     case 8:
                     case 9:
                     case 10:
                     case 11:
                     case 16:
                  }
               }

               if (var5 >= 0) {
                  if (!var1.containsKey(Integer.valueOf(var5))) {
                     var4.k5(var5);
                     var1.addItem(Integer.valueOf(var5), var4);
                  } else {
                     var2.addItem(var4);
                  }
               } else {
                  var2.addItem(var4);
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      int var15 = 0;
      List$Enumerator var16 = var2.iterator();

      try {
         while (var16.hasNext()) {
            z4m var6 = (z4m)var16.next();
            int var7 = var15;

            while (var1.containsKey(var7)) {
               var7++;
            }

            var6.k5(var7);
            var1.addItem(var7, var6);
            var15 = var7 + 1;
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var16, IDisposable.class)) {
            var16.dispose();
         }
      }

      if (var0.k5() == 2) {
         u9(var0);
      }
   }

   private static void u9(y2q var0) {
      int var1 = var0.t2().size();
      int var2 = var1 - 1;

      while (var1 > 0) {
         k1z var3 = var0.t2().get_Item(--var1);
         if (var3.h0() && var3.k7() != null && var1 < var2) {
            var0.t2().removeAt(var1);
            var0.t2().insertItem(var2, var3);
            var2--;
         }
      }
   }

   private static void h0(y2q var0) {
      Dictionary var1 = null;
      y2q var2 = null;
      switch (var0.k5()) {
         case 4:
            if (var0.r4()) {
               var2 = var0.n5(2);
            } else {
               var2 = var0.n5(3);
            }

            var1 = new Dictionary();
            int var3 = var2.t9().size();

            while (var3 > 0) {
               z4m var4 = var2.t9().get_Item(--var3);
               if (var4.c8()) {
                  break;
               }

               var1.addItem(var4.k5().getIndex(), var4);
            }

            if (var2 == null || var2.m3()) {
               var2 = var0.n5(0);
            }
            break;
         case 6:
            var2 = var0.n5(5);
            break;
         default:
            return;
      }

      if (var2 == null) {
         throw new NullReferenceException("No parent slides found for inheritance from " + com.aspose.slides.ms.System.j8.n5(var0.l6()));
      }

      Dictionary var23 = new Dictionary();
      Dictionary var24 = new Dictionary();
      List$Enumerator var5 = var2.t9().iterator();

      try {
         while (var5.hasNext()) {
            z4m var6 = (z4m)var5.next();
            if (var6.l6().h0()) {
               boolean var7 = v0q.l6(var6.k5());
               if (var7) {
                  if (var24.containsKey(var6.k5().getType())) {
                     var24.set_Item(var6.k5().getType(), var6);
                  } else {
                     var24.addItem(var6.k5().getType(), var6);
                  }
               }

               if (var23.containsKey(var6.k5().getIndex())) {
                  if (!var7) {
                     var23.set_Item(var6.k5().getIndex(), var6);
                  }
               } else {
                  var23.addItem(var6.k5().getIndex(), var6);
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      List$Enumerator var25 = var0.t9().iterator();

      try {
         while (var25.hasNext()) {
            z4m var26 = (z4m)var25.next();
            z4m var8 = null;
            if (var26.u3() == 0) {
               k1z var9 = var26.l6();
               Placeholder var10 = var26.k5();
               com.aspose.slides.internal.k0r.g8v var11 = null;
               if (var1 != null && var1.containsKey(var10.getIndex())) {
                  var8 = (z4m)var1.get_Item(var10.getIndex());
                  var11 = new com.aspose.slides.internal.k0r.g8v();
                  var11.n5(var8.l6().s7().v4());
                  var10 = var8.k5();
                  var9.n5(var8.l6());
                  var26.n5(var8.l6());
                  var8 = null;
               }

               if (v0q.l6(var10)) {
                  if (var24.containsKey(var10.getType())) {
                     var8 = (z4m)var24.get_Item(var10.getType());
                  }
               } else if (var23.containsKey(var10.getIndex())) {
                  var8 = (z4m)var23.get_Item(var10.getIndex());
               }

               if (var8 != null) {
                  var9.n5(var8.l6());
                  long var12 = var8.l6().m3().l6();
                  var9.m3().u9(true);
                  com.aspose.slides.internal.k0r.z5 var14 = new com.aspose.slides.internal.k0r.z5(769, var12);
                  var9.z8().l6().n5(var14);
               }

               if (var11 != null) {
                  var9.w1().n5(var11);
               }

               if (var0.k5() == 4) {
                  var26.k5(-1);
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var25, IDisposable.class)) {
            var25.dispose();
         }
      }
   }

   private static void c8(y2q var0) {
      boolean var1 = var0.s7() == null && var0.x8() == null;
      com.aspose.slides.internal.k0r.h3d var2 = var0.s7();
      int var3 = 0;
      List$Enumerator var4 = var0.t9().iterator();

      try {
         while (var4.hasNext()) {
            z4m var5 = (z4m)var4.next();
            boolean var6 = var5.a6() != 0;
            if (var5.u9() == -1 && var1) {
               var6 = false;
            }

            if (var5.l6().h0() && var6) {
               var5.n5();
               if (var2 != null && var3 < 8 && var5.u3() == 0) {
                  var2.c8()[var3] = var5.a6();
                  var3++;
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }
   }

   private static void n5(f0o var0) {
      n7r var1 = com.aspose.slides.internal.v6g.k5.n5(var0, n7r.class);
      if (var1 != null) {
         h1f.n5(var1);
      } else {
         n6s var2 = com.aspose.slides.internal.v6g.k5.n5(var0, n6s.class);
         if (var2 != null) {
            w3p.n5(var2);
         } else {
            k1z var3 = com.aspose.slides.internal.v6g.k5.n5(var0, k1z.class);
            if (var3 != null) {
               w6n.k5(var3);
            }
         }
      }
   }

   private static void n5(n6s var0) {
      com.aspose.slides.internal.k0r.r2 var1 = new com.aspose.slides.internal.k0r.r2();
      g6o var2 = var0.a6().n5();
      long var3 = 0L;
      List$Enumerator var5 = var0.n3().iterator();

      try {
         while (var5.hasNext()) {
            k1z var6 = (k1z)var5.next();
            if (var6.h0()) {
               Connector var7 = com.aspose.slides.internal.v6g.k5.n5(var6.s7(), Connector.class);
               if (var7 != null) {
                  com.aspose.slides.internal.k0r.s6 var8 = new com.aspose.slides.internal.k0r.s6();
                  var8.n5(++var3);
                  var8.u3(var6.m3().l6());
                  if (var7.getStartShapeConnectedTo() != null) {
                     long var9 = ((Shape)var7.getStartShapeConnectedTo()).v4();
                     if (var2.r4().containsKey(var9)) {
                        var8.l6(var2.r4().get_Item(var9).m3().l6());
                     }
                  }

                  var8.n5((var8.l6() & 4294967295L) == 0L ? -1 : (int)var7.getStartShapeConnectionSiteIndex());
                  if (var7.getEndShapeConnectedTo() != null) {
                     long var14 = ((Shape)var7.getEndShapeConnectedTo()).v4();
                     if (var2.r4().containsKey(var14)) {
                        var8.k5(var2.r4().get_Item(var14).m3().l6());
                     }
                  }

                  var8.l6((var8.k5() & 4294967295L) == 0L ? -1 : (int)var7.getEndShapeConnectionSiteIndex());
                  var1.e2().addItem(var8);
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      if (var1.e2().size() > 0) {
         var1.k5((short)var1.e2().size());
         var0.a6().a6().e2().addItem(var1);
      }
   }

   private static void t2(y2q var0) {
      IControlCollection var1 = var0.l6().getControls();

      for (int var2 = 0; var2 < var1.size(); var2++) {
         y6z var3 = new y6z((Control)var1.get_Item(var2), var0.u9());
         w6n.n5(var3);
      }
   }

   private static void l6(n6s var0) {
      y2q var1 = var0.a6();
      String var2 = null;
      String[] var3 = new String[]{var2};
      String[] var4 = null;
      String[][] var5 = new String[][]{var4};
      byte[] var6 = null;
      byte[][] var7 = new byte[][]{var6};
      int[] var8 = Presentation.n5((s4e)var1.n5().n5().t4(), var7);
      var6 = var7[0];
      var5[0] = com.aspose.slides.internal.n8e.w1.u3();
      if (Arrays.equals(var8, i7t.l6) && var6 != null && var6.length > 0) {
         var5[0] = com.aspose.slides.ms.System.d1.n5(Presentation.n5(var6), new String[]{"\r\n", "\n", "\r", "\n\r"}, 0);
      }

      int[] var9 = com.aspose.slides.internal.n8e.z7.n5;
      if (com.aspose.slides.internal.n8e.f2.l6() == com.aspose.slides.internal.n8e.z7.l6) {
         try {
            var9 = com.aspose.slides.internal.n8e.f2.l6();
         } catch (IllegalStateException var20) {
            var9 = com.aspose.slides.internal.n8e.z7.n5;
            com.aspose.slides.internal.n8e.v4.n5(var20);
         }
      }

      var4 = var5[0];
      var3[0] = com.aspose.slides.ms.System.d1.n5(com.aspose.slides.ms.System.p8.k5(), var4);
      var2 = var3[0];
      if ((
            !Arrays.equals(com.aspose.slides.internal.n8e.w1.n5(), com.aspose.slides.internal.n8e.r4.l6)
               || com.aspose.slides.internal.n8e.j5.n5() == null
               || !(com.aspose.slides.internal.n8e.j5.n5() instanceof com.aspose.slides.internal.n8e.w1)
         )
         && !Arrays.equals(var8, i7t.k5)
         && !Arrays.equals(var9, com.aspose.slides.internal.n8e.z7.l6)) {
         BaseSlide var10 = var1.l6();
         AutoShape var11 = new AutoShape((r0g)var10.getShapes());
         TextFrame var12 = new TextFrame(var11);
         com.aspose.slides.internal.o9b.f2 var13 = ((SlideSize)var1.n5().n5().getSlideSize()).n5().a6();
         var11.setFrame(new ShapeFrame(0.0F, 0.0F, var13.l6(), var13.k5(), (byte)0, (byte)0, 0.0F));
         var11.n5(var12);
         var12.getTextFrameFormat().setAnchoringType((byte)1);
         var12.n5(var2);
         var12.getParagraphs().get_Item(0).getParagraphFormat().setAlignment(1);
         var11.getLineFormat().getFillFormat().setFillType((byte)0);
         IGenericEnumerator var14 = var12.getParagraphs().iterator();

         try {
            while (var14.hasNext()) {
               Paragraph var15 = (Paragraph)var14.next();
               var15.getParagraphFormat().setAlignment(1);
               var15.getParagraphFormat().setSpaceWithin(150.0F);
               PortionFormat var16 = (PortionFormat)var15.getPortions().get_Item(0).getPortionFormat();
               var16.setFontHeight(32.0F);
               ((FillFormat)var16.getFillFormat()).setFillType((byte)1);
               ((ColorFormat)((FillFormat)var16.getFillFormat()).getSolidFillColor()).n5(com.aspose.slides.internal.o9b.c8.n5(255, 255, 216, 207).o8());
               ((EffectFormat)var16.getEffectFormat()).enablePresetShadowEffect();
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
               var14.dispose();
            }
         }

         var12.getTextFrameFormat().setAutofitType((byte)2);
         k1z var25 = new k1z(var11, var0);
         w6n.k5(var25);
         com.aspose.slides.internal.k0r.r3 var26 = var25.z8();
         var26.l6().l6(new com.aspose.slides.internal.k0r.z5(127, 14680288L));
         var25.c8();
      }
   }

   private static void s7(y2q var0) {
      BaseSlide var1 = var0.l6();
      com.aspose.slides.internal.k0r.r4 var2 = var0.u3();
      com.aspose.slides.internal.k0r.l7h var3 = new com.aspose.slides.internal.k0r.l7h();
      var2.n5(var3);
      com.aspose.slides.internal.k0r.x4g var4 = var1.u3().u3();
      n5(var3, var4);
      u5b.l6(var1.getCustomData(), var3);
      com.aspose.slides.internal.k0r.m6n var5 = new com.aspose.slides.internal.k0r.m6n();
      var3.e2().addItem(var5);
      com.aspose.slides.internal.k0r.z1 var6 = new com.aspose.slides.internal.k0r.z1("___PPT10", (short)0);
      var6.w1().n5((short)0);
      var5.e2().addItem(var6);
      com.aspose.slides.internal.k0r.g4 var7 = new com.aspose.slides.internal.k0r.g4();
      var5.e2().addItem(var7);
      var7.w1().n5((byte)0);
      var7.w1().n5((short)0);
      if (var1 != null) {
         ICommentAuthorCollection var8 = var0.n5().n5().getCommentAuthors();
         if (var8 != null) {
            IGenericEnumerator var9 = var8.iterator();

            try {
               while (var9.hasNext()) {
                  ICommentAuthor var10 = (ICommentAuthor)var9.next();
                  ICommentCollection var11 = var10.getComments();
                  IGenericEnumerator var12 = var11.iterator();

                  try {
                     while (var12.hasNext()) {
                        Comment var13 = (Comment)var12.next();
                        if ((Slide)var13.getSlide() == var1) {
                           com.aspose.slides.internal.k0r.z8 var14 = new com.aspose.slides.internal.k0r.z8();
                           var7.e2().addItem(var14);
                           n5(var13, var14, var0.n5());
                        }
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var12, IDisposable.class)) {
                        var12.dispose();
                     }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
                  var9.dispose();
               }
            }
         }
      }

      Slide var23 = com.aspose.slides.internal.v6g.k5.n5(var1, Slide.class);
      if (var23 != null && !var23.q0().c8()) {
         com.aspose.slides.internal.k0r.o8m var24 = new com.aspose.slides.internal.k0r.o8m();
         var24.n5(2);
         var7.e2().addItem(var24);
      }

      com.aspose.slides.internal.k0r.r5t var25 = new com.aspose.slides.internal.k0r.r5t();
      var25.w1().n5((byte)0);
      var25.w1().n5((short)0);
      var7.e2().addItem(var25);
      n5(var7, var0);
   }

   private static void n5(com.aspose.slides.internal.k0r.d0 var0, com.aspose.slides.internal.k0r.x4g var1) {
      if (var1 != null) {
         com.aspose.slides.internal.k0r.m6n var2 = new com.aspose.slides.internal.k0r.m6n();
         var0.e2().addItem(var2);
         com.aspose.slides.internal.k0r.z1 var3 = new com.aspose.slides.internal.k0r.z1("___PPT12", (short)0);
         var2.e2().addItem(var3);
         com.aspose.slides.internal.k0r.f3 var4 = new com.aspose.slides.internal.k0r.f3();
         var2.e2().addItem(var4);
         var4.e2().addItem(var1);
      }
   }

   private static void n5(Comment var0, com.aspose.slides.internal.k0r.z8 var1, g6o var2) {
      var1.n5(var0.getAuthor().getName());
      var1.l6(var0.getText());
      var1.k5(var0.getAuthor().getInitials());
      var1.u9().n5(var0.n5().m3());
      var1.u9()
         .n5(
            new com.aspose.slides.internal.o9b.j5(
               com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var0.l6().l6() * 8.0F), 14),
               com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var0.l6().k5() * 8.0F), 14)
            )
         );
      var1.u9().n5(var2.w1());
   }

   private static void n5(com.aspose.slides.internal.k0r.h0 var0, y2q var1) {
      BaseSlide var2 = var1.l6();
      if (var2 != null
         && var2.getTimeline() != null
         && (var2.getTimeline().getMainSequence().getCount() != 0 || var2.getTimeline().getInteractiveSequences().getCount() != 0)) {
         com.aspose.slides.internal.k4y.k8g var3 = var1.y1();
         d5t var4 = var1.a0();
         com.aspose.slides.internal.k0r.i0 var5 = new com.aspose.slides.internal.k0r.i0();
         var0.e2().addItem(var5);
         com.aspose.slides.internal.k0r.t6 var6 = new com.aspose.slides.internal.k0r.t6();
         var0.e2().addItem(var6);
         s4n.n5(var3, var6, var4);
         x2.n5(var3, var0, var4);
      }
   }

   private static void x8(y2q var0) {
      BaseSlide var1 = var0.l6();
      com.aspose.slides.internal.k4y.k8g var2 = var0.y1();
      SortedList var3 = new SortedList();
      List$Enumerator var4 = var0.t2().iterator();

      try {
         while (var4.hasNext()) {
            k1z var5 = (k1z)var4.next();
            if (var5.h0()) {
               Shape var6 = var5.s7();
               if (var6 != null) {
                  var3.set_Item(com.aspose.slides.ms.System.l4.n5(var6.v4(), com.aspose.slides.internal.x7n.l6.k5()), var6);
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      Dictionary var10 = n5(var3);
      var0.n5(new d5t(var10, var0.n5()));
      o5.n5(var1.getTimeline(), var1.getShapes(), var2, var0.a0());
   }

   private static Dictionary<IShape, Long> n5(SortedList<String, ISlideComponent> var0) {
      Dictionary var1 = new Dictionary();
      IGenericEnumerator var2 = var0.iterator();

      try {
         while (var2.hasNext()) {
            KeyValuePair var3 = (KeyValuePair)var2.next();
            Shape var4 = com.aspose.slides.internal.v6g.k5.n5(var3.getValue(), Shape.class);
            if (var4 != null) {
               var1.addItem(var4, var4.v4());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1;
   }
}
