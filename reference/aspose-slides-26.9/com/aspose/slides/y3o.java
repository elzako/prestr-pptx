package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.ms.System.IDisposable;

class y3o {
   public static void n5(t2s var0) {
      LayoutSlide var1 = com.aspose.slides.internal.v6g.k5.n5(var0.y4(), LayoutSlide.class);
      if (var1 != null) {
         com.aspose.slides.internal.k0r.u6p var2 = com.aspose.slides.internal.v6g.k5.n5(var0.s7(), com.aspose.slides.internal.k0r.u6p.class);
         if (var1.getLayoutType() != 0) {
            throw new NotImplementedException("Non Title-Layout occured.");
         }

         var1.setName("Title Slide");
         t2s var3 = var0.c8();
         t2s var4 = var3.c8();
         boolean var5 = var0.a6().j5() && var3.n3() == 2 && var4 != null;
         if (var5) {
            var3.n5();
         }

         n0.n5(var0);
         if (var2 != null) {
            var1.q0().n5(true);
            com.aspose.slides.internal.k0r.u6p var6 = com.aspose.slides.internal.v6g.k5.n5(var0.s7(), com.aspose.slides.internal.k0r.u6p.class);
            var1.setShowMasterShapes(var2.z8().l6());
            if (var6 != null) {
               e7j.n5(var1.q0(), var6);
            }

            if (var5) {
               MasterSlide var7 = (MasterSlide)var4.y4();
               LayoutSlide var8 = (LayoutSlide)var7.l6(var1.getLayoutType());
               var0.n5(var8);
               var8.setName(var1.getName());
               var8.setShowMasterShapes(var1.getShowMasterShapes());
               n5(var0.y4(), var1);
               n0r.n5(var8.getShapes(), var1.getShapes());
            }
         }
      }
   }

   public static void n5(d5f var0) {
      IGenericEnumerator var1 = var0.k7().getValues().iterator();

      try {
         while (var1.hasNext()) {
            d5f$n5 var2 = (d5f$n5)var1.next();
            if (!var2.n5().containsKey(-1)) {
               throw new NullReferenceException("Haven't original master for existed list!");
            }

            t2s var3 = var2.n5().get_Item(-1);
            MasterSlide var4 = (MasterSlide)var3.y4();
            IGenericEnumerator var5 = var2.n5().iterator();

            try {
               while (var5.hasNext()) {
                  KeyValuePair var6 = (KeyValuePair)var5.next();
                  if ((Integer)var6.getKey() != -1) {
                     t2s var7 = (t2s)var6.getValue();
                     com.aspose.slides.internal.k0r.k2 var8 = (com.aspose.slides.internal.k0r.k2)var7.s7();
                     com.aspose.slides.internal.k0r.e5a var9 = var8.z1().get_Item((Integer)var6.getKey());
                     ILayoutSlide var10 = e5e.n5(var9, var7);
                     if (var10 != null) {
                        if (var0.j5()) {
                           if (var7 != var3) {
                              LayoutSlide var11 = (LayoutSlide)var4.l6(var10.getLayoutType());
                              var7.n5(var11);
                              var7.m3().clear();
                              var7.n5(true);
                              n0.n5(var7);
                              var11.setName(var10.getName());
                              n5(var7.y4(), (LayoutSlide)var10);
                              var7.l6();
                              if (((BaseOverrideThemeManager)var10.getThemeManager()).u3().n5()) {
                                 ((BaseOverrideThemeManager)var11.getThemeManager()).u3().n5(((BaseOverrideThemeManager)var10.getThemeManager()).u3());
                                 ((BaseOverrideThemeManager)var11.getThemeManager()).u3().n5(true);
                              }

                              var11.setShowMasterShapes(((LayoutSlide)var10).getShowMasterShapes());
                              var3.t9().addItem((Integer)var6.getKey() & 65535, var11);
                              var7.t9().addItem((Integer)var6.getKey() & 65535, var11);
                           } else if (var7.a0()) {
                              LayoutSlide var29 = (LayoutSlide)var4.l6(var10.getLayoutType());
                              var7.n5(var29);
                              var29.setName(var10.getName());
                              n5(var7.y4(), (LayoutSlide)var10);
                              var7.l6();
                              var29.setShowMasterShapes(((LayoutSlide)var10).getShowMasterShapes());
                           } else {
                              var3.t9().addItem((Integer)var6.getKey() & 65535, (LayoutSlide)var10);
                              n5(var3, (LayoutSlide)var10);
                           }
                        } else {
                           n5(var3, (LayoutSlide)var10);
                           ((LayoutSlide)var10).setShowMasterShapes(true);
                           var7.t9().addItem((Integer)var6.getKey() & 65535, (LayoutSlide)var10);
                           if (var7 != var3) {
                              var3.t9().addItem((Integer)var6.getKey() & 65535, (LayoutSlide)var10);
                           }
                        }
                     }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
                  var5.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      IGenericEnumerator var27 = var0.n5().getLayoutSlides().iterator();

      try {
         while (var27.hasNext()) {
            LayoutSlide var28 = (LayoutSlide)var27.next();
            if ((var28.t4().u3() & 4294967295L) == 0L) {
               var28.t4().n5(var0.n5().n3().w1());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var27, IDisposable.class)) {
            var27.dispose();
         }
      }
   }

   private static void n5(t2s var0, LayoutSlide var1) {
      List var2 = t2s.l6(var1);
      SortedList var3 = new SortedList(var2.size());
      long var4 = 0L;
      List$Enumerator var6 = var2.iterator();

      try {
         while (var6.hasNext()) {
            Shape var7 = (Shape)var6.next();
            Placeholder var8 = com.aspose.slides.internal.v6g.k5.n5(var7.getPlaceholder(), Placeholder.class);
            if ((var8.getIndex() & 4294967295L) >= 0L) {
               if ((var4 & 4294967295L) < (var8.getIndex() & 4294967295L)) {
                  var4 = var8.getIndex();
               }

               if (!var3.containsKey(var8.getIndex())) {
                  var3.addItem(var8.getIndex(), var7);
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }

      if ((++var4 & 4294967295L) < 10L) {
         var4 = 10L;
      }

      List var21 = t2s.l6(var0.y4());
      List$Enumerator var22 = var21.iterator();

      try {
         while (var22.hasNext()) {
            Shape var9 = (Shape)var22.next();
            Placeholder var10 = com.aspose.slides.internal.v6g.k5.n5(var9.getPlaceholder(), Placeholder.class);
            if (v0q.n5(var10)) {
               long var11 = var9.getPlaceholder().getIndex();
               var10.n5(var4++);
               var1.getShapes().addClone(var9);
               var10.n5(var11);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var22, IDisposable.class)) {
            var22.dispose();
         }
      }
   }

   private static void n5(BaseSlide var0, LayoutSlide var1) {
      ShapeCollection var2 = (ShapeCollection)var0.getShapes();
      ShapeCollection var3 = (ShapeCollection)var1.getShapes();
      List var4 = t2s.l6(var0);
      List var5 = t2s.l6(var1);
      SortedList var6 = new SortedList(var4.size());
      long var7 = 10L;
      List$Enumerator var9 = var5.iterator();

      try {
         while (var9.hasNext()) {
            Shape var10 = (Shape)var9.next();
            Placeholder var11 = com.aspose.slides.internal.v6g.k5.n5(var10.getPlaceholder(), Placeholder.class);
            if ((var7 & 4294967295L) <= (var11.getIndex() & 4294967295L)) {
               var7 = (var11.getIndex() & 4294967295L) + 1L & 4294967295L;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
            var9.dispose();
         }
      }

      List$Enumerator var48 = var4.iterator();

      try {
         while (var48.hasNext()) {
            Shape var49 = (Shape)var48.next();
            Placeholder var12 = com.aspose.slides.internal.v6g.k5.n5(var49.getPlaceholder(), Placeholder.class);
            if ((var12.getIndex() & 4294967295L) >= 0L) {
               if (v0q.n5(var12)) {
                  var12.n5(var7++);
                  var6.addItem(var12.getIndex(), var49);
               } else {
                  var2.remove(var49);
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var48, IDisposable.class)) {
            var48.dispose();
         }
      }

      List$Enumerator var50 = var5.iterator();

      try {
         while (var50.hasNext()) {
            Shape var51 = (Shape)var50.next();
            Placeholder var13 = com.aspose.slides.internal.v6g.k5.n5(var51.getPlaceholder(), Placeholder.class);
            if (var6.containsKey(var13.getIndex())) {
               Shape var14 = (Shape)var6.get_Item(var13.getIndex());
               var2.remove((IShape)var6.get_Item(var13.getIndex()));
               var6.removeItemByKey(var13.getIndex());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var50, IDisposable.class)) {
            var50.dispose();
         }
      }

      IGenericEnumerator var52 = var3.iterator();

      try {
         while (var52.hasNext()) {
            IShape var53 = (IShape)var52.next();
            Shape var55 = (Shape)var53;
            var55.l6(var2);
            var2.n5(var55);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var52, IDisposable.class)) {
            var52.dispose();
         }
      }

      IGenericEnumerator var54 = var6.getValues().iterator();

      try {
         while (var54.hasNext()) {
            Shape var56 = (Shape)var54.next();
            var2.n5.removeItem(var56);
            var2.n5.addItem(var56);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var54, IDisposable.class)) {
            var54.dispose();
         }
      }
   }

   static void l6(t2s var0) {
      if (var0.n3() == 0) {
         IGenericEnumerator var1 = var0.k7().iterator();

         try {
            while (var1.hasNext()) {
               v5s var2 = (v5s)var1.next();
               a9x var3 = var2.a6();
               if (var3.q0() == null) {
                  var2.n5(false);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
               var1.dispose();
            }
         }
      }
   }

   public static void n5(y2q var0) {
      SortedList var1 = new SortedList(var0.z1().size());
      List$Enumerator var2 = var0.z1().iterator();

      try {
         while (var2.hasNext()) {
            y2q var3 = (y2q)var2.next();
            a6(var3);
            u9(var3);
            if (var3.m3()) {
               var1.addItem(var3.z8(), var3);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      int var7 = var1.getKeys().size();

      while (var7 > 0) {
         y2q var4 = (y2q)var1.get_Item(var1.getKeys().get_Item(--var7));
         var0.u3().n5(var4.j5());
      }

      u3(var0);
   }

   private static void u3(y2q var0) {
      if (var0.y4() >= 0) {
         com.aspose.slides.internal.k0r.k2 var1 = com.aspose.slides.internal.v6g.k5.n5(var0.u3(), com.aspose.slides.internal.k0r.k2.class);
         if (var1 != null) {
            com.aspose.slides.internal.k0r.x7n var2 = new com.aspose.slides.internal.k0r.x7n();
            var2.n5(var0.y4() & 4294967295L);
            var1.n5(var2);
         }
      }
   }

   private static boolean n5(LayoutSlide var0) {
      if (var0.getLayoutType() != 0) {
         return false;
      }

      List var1 = t2s.l6(var0);
      List$Enumerator var2 = var1.iterator();

      try {
         while (var2.hasNext()) {
            Shape var3 = (Shape)var2.next();
            Placeholder var4 = com.aspose.slides.internal.v6g.k5.n5(var3.getPlaceholder(), Placeholder.class);
            switch (var4.getType()) {
               case 2:
               case 3:
               case 4:
               case 5:
               case 6:
                  break;
               default:
                  return false;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return true;
   }

   static void l6(y2q var0) {
      boolean var1 = false;
      g6o var2 = var0.n5();
      MasterSlide var3 = (MasterSlide)var0.l6();
      if (var0.u3() == null) {
         throw new NullReferenceException();
      }

      if (!var0.r4()) {
         for (int var57 = 0; var57 < var3.getLayoutSlides().size(); var57++) {
            LayoutSlide var58 = (LayoutSlide)var3.getLayoutSlides().get_Item(var57);
            if (n5(var58)) {
               com.aspose.slides.internal.k0r.o8 var59 = com.aspose.slides.internal.v6g.k5.n5(var0.u3(), com.aspose.slides.internal.k0r.o8.class);
               if (var59 != null) {
                  new y2q(var58, var2);
               }
            }
         }
      } else {
         var1 |= var2.h2();
         int var4 = 0;
         boolean var5 = false;
         List var6 = new List();
         n5(var3.getShapes(), 0, var6);
         IGenericEnumerator var7 = var3.getLayoutSlides().iterator();

         try {
            while (var7.hasNext()) {
               ILayoutSlide var8 = (ILayoutSlide)var7.next();
               var4++;
               y2q var9 = new y2q((LayoutSlide)var8, var2);
               var9.l6(var4);
               var1 |= var8.hasDependingSlides();
               boolean var10 = false;
               String var11 = " ... ";
               if (((LayoutSlide)var8).t4().n3()) {
                  var11 = com.aspose.slides.ms.System.d1.n5(var11, "IsUserDrawn | ");
               }

               if (var8.getBackground() != null && var8.getBackground().getType() != -1) {
                  var10 = true;
                  var11 = com.aspose.slides.ms.System.d1.n5(var11, "OwnBackground | ");
               }

               if (var8.getThemeManager().isOverrideThemeEnabled()) {
                  var11 = com.aspose.slides.ms.System.d1.n5(var11, "OwnTheme | ");
               }

               var10 |= var8.getThemeManager().isOverrideThemeEnabled();
               if (!var8.getShowMasterShapes()) {
                  var11 = com.aspose.slides.ms.System.d1.n5(var11, "HideMaster | ");
               }

               var10 |= !var8.getShowMasterShapes();
               List var12 = new List();
               if (!var10) {
                  var10 |= n5(var8.getShapes(), 0, var12);
               }

               if (!var10) {
                  SortedList var13 = new SortedList();
                  SortedList var14 = new SortedList();
                  boolean var15 = true;
                  boolean var16 = false;
                  if (var12.size() < var6.size()) {
                     List$Enumerator var63 = var6.iterator();

                     try {
                        while (var63.hasNext()) {
                           Placeholder var65 = (Placeholder)var63.next();
                           if (!var13.containsKey(var65.getIndex())) {
                              var13.addItem(var65.getIndex(), var65);
                           }

                           if (!var14.containsKey(var65.getType())) {
                              var14.addItem(var65.getType(), var65);
                           }
                        }
                     } finally {
                        if (com.aspose.slides.internal.v6g.k5.n5(var63, IDisposable.class)) {
                           var63.dispose();
                        }
                     }

                     List$Enumerator var66 = var12.iterator();

                     try {
                        while (var66.hasNext()) {
                           Placeholder var67 = (Placeholder)var66.next();
                           boolean var68 = var13.containsKey(var67.getIndex());
                           if (!var68 && v0q.n5(var67) && var14.containsKey(var67.getType())) {
                              var68 = (var67.getIndex() & 4294967295L) >= 10L;
                           }

                           var15 &= var68;
                           var16 |= var68;
                        }
                     } finally {
                        if (com.aspose.slides.internal.v6g.k5.n5(var66, IDisposable.class)) {
                           var66.dispose();
                        }
                     }
                  } else {
                     List$Enumerator var17 = var12.iterator();

                     try {
                        while (var17.hasNext()) {
                           Placeholder var18 = (Placeholder)var17.next();
                           if (!var13.containsKey(var18.getIndex())) {
                              var13.addItem(var18.getIndex(), var18);
                           }

                           if (!var14.containsKey(var18.getType())) {
                              var14.addItem(var18.getType(), var18);
                           }
                        }
                     } finally {
                        if (com.aspose.slides.internal.v6g.k5.n5(var17, IDisposable.class)) {
                           var17.dispose();
                        }
                     }

                     List$Enumerator var64 = var6.iterator();

                     try {
                        while (var64.hasNext()) {
                           Placeholder var19 = (Placeholder)var64.next();
                           boolean var20 = var13.containsKey(var19.getIndex());
                           if (!var20 && v0q.n5(var19) && var14.containsKey(var19.getType())) {
                              var20 = (((Placeholder)var14.get_Item(var19.getType())).getIndex() & 4294967295L) >= 10L;
                           }

                           var15 &= var20;
                           var16 |= var20;
                        }
                     } finally {
                        if (com.aspose.slides.internal.v6g.k5.n5(var64, IDisposable.class)) {
                           var64.dispose();
                        }
                     }
                  }

                  var10 = !var15;
               }

               if (var8.hasDependingSlides()) {
                  var11 = com.aspose.slides.ms.System.d1.n5(var11, " [USED] |");
               }

               if (var8.getLayoutType() == -1) {
                  var11 = com.aspose.slides.ms.System.d1.n5(var11, " [Custom] |");
               }

               if (!var10) {
                  var9.n5(var0);
               }

               var1 |= var10;
               var5 |= var10;
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
               var7.dispose();
            }
         }

         var0.l6(var5);
         if (var1) {
            var0.q0();
         }
      }
   }

   private static boolean n5(IShapeCollection var0, int var1, List<Placeholder> var2) {
      boolean var3 = false;
      IGenericEnumerator var4 = var0.iterator();

      try {
         while (var4.hasNext()) {
            IShape var5 = (IShape)var4.next();
            GroupShape var6 = com.aspose.slides.internal.v6g.k5.n5(var5, GroupShape.class);
            if (var6 != null) {
               var3 |= n5(var6.getShapes(), var1 + 1, var2);
            } else if (var5.getPlaceholder() != null) {
               var2.addItem((Placeholder)var5.getPlaceholder());
            } else {
               var3 = true;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      return var3;
   }

   private static void a6(y2q var0) {
      com.aspose.slides.internal.k0r.u6p var1 = com.aspose.slides.internal.v6g.k5.n5(var0.u3(), com.aspose.slides.internal.k0r.u6p.class);
      y2q var2 = var0.n5(0);
      if (var1 != null) {
         s7(var0);
      } else if (var0.r4()) {
         if (var0.m3()) {
            var0.u9().n5(var0.l6().k5);
            h0(var0);
            e5e.k5(var0);
         } else {
            c8(var0);
            h0(var0);
            byte var3 = var0.l6().getBackground().getType();
            var0.l6().getBackground().setType((byte)-1);
            BaseOverrideThemeManager var4 = (BaseOverrideThemeManager)((LayoutSlide)var0.l6()).getThemeManager();
            boolean var5 = var4.u3().n5();
            var4.u3().n5(false);
            e5e.k5(var0);
            var4.u3().n5(var5);
            var0.l6().getBackground().setType(var3);
            t2(var0);
         }
      }
   }

   private static void u9(y2q var0) {
      LayoutSlide var1 = (LayoutSlide)var0.l6();
      IGenericEnumerator var2 = var1.getShapes().iterator();

      try {
         while (var2.hasNext()) {
            IShape var3 = (IShape)var2.next();
            ((Shape)var3).k5(false);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      IGenericEnumerator var12 = var1.getControls().iterator();

      try {
         while (var12.hasNext()) {
            Control var4 = (Control)var12.next();
            var4.n5(false);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var12, IDisposable.class)) {
            var12.dispose();
         }
      }
   }

   private static void h0(y2q var0) {
      LayoutSlide var1 = (LayoutSlide)var0.l6();
      IGenericEnumerator var2 = var1.getShapes().iterator();

      try {
         while (var2.hasNext()) {
            IShape var3 = (IShape)var2.next();
            Placeholder var4 = com.aspose.slides.internal.v6g.k5.n5(var3.getPlaceholder(), Placeholder.class);
            if (var4 == null) {
               ((Shape)var3).k5(true);
            } else {
               ((Shape)var3).k5(v0q.n5(var4));
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      IGenericEnumerator var13 = var1.getControls().iterator();

      try {
         while (var13.hasNext()) {
            Control var14 = (Control)var13.next();
            var14.n5(true);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var13, IDisposable.class)) {
            var13.dispose();
         }
      }
   }

   private static void c8(y2q var0) {
      MasterSlide var1 = com.aspose.slides.internal.v6g.k5.n5(((LayoutSlide)var0.l6()).getMasterSlide(), MasterSlide.class);
      g6o var2 = var0.n5();
      var2.n5(var1);
      x2u.l6(var0);
      e5e.n5(var0);
      n0.n5(var0);
      com.aspose.slides.internal.k0r.k2 var3 = (com.aspose.slides.internal.k0r.k2)var0.u3();
      com.aspose.slides.internal.k0r.z1 var4 = new com.aspose.slides.internal.k0r.z1("Office Theme", (short)2);
      var4.w1().n5((byte)0);
      var3.e2().addItem(var4);
      x2u.k5(var0);
      IMasterThemeManager var5 = var1.getThemeManager();
      var3.n5(com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.a3.l6(var0.z8()), "_", var5.getOverrideTheme().getName()}));
      a5n.n5(var0);
      x2u.n5(var0, (TextStyle)var1.getTitleStyle());
      x2u.n5(var0, (TextStyle)var1.getBodyStyle());
      x2u.n5(var0, (TextStyle)var1.getOtherStyle());
      x2u.n5(var0, (TextStyle)var1.k7());
      x2u.n5(var0, (TextStyle)var1.m3());
      x2u.n5(var0, (TextStyle)var1.m1());
   }

   private static void t2(y2q var0) {
      y2q var1 = var0.n5(0);
      if (var1.y4() >= 0) {
         com.aspose.slides.internal.k0r.k2 var2 = com.aspose.slides.internal.v6g.k5.n5(var0.u3(), com.aspose.slides.internal.k0r.k2.class);
         if (var2 != null) {
            com.aspose.slides.internal.k0r.u1s var3 = new com.aspose.slides.internal.k0r.u1s();
            var3.n5(var1.y4() & 4294967295L);
            var2.n5(var3);
         }
      }
   }

   private static void s7(y2q var0) {
      LayoutSlide var1 = (LayoutSlide)var0.l6();
      g6o var2 = var0.n5();
      com.aspose.slides.internal.k0r.u6p var3 = (com.aspose.slides.internal.k0r.u6p)var0.u3();
      com.aspose.slides.internal.k0r.w1n var4 = var0.n3();
      var2.t4().addItem(var1, var4.u3());
      var4.n5(var1.u3().l6());
      y2q var5 = var0.n5(0);
      com.aspose.slides.internal.k0r.h3d var6 = var3.z8();
      var6.n5(2);
      var6.n5(var5.n3().u3());
      var6.l6(0L);
      var6.k5(var1.getBackground().getType() == -1);
      var6.n5(false);
      var6.l6(false);
      n0.n5(var0);
      var6.c8()[0] = 3;
      var6.c8()[1] = 4;
      var6.c8()[2] = 7;
      var6.c8()[3] = 9;
      var6.c8()[4] = 8;
   }

   static void k5(y2q var0) {
      if (var0.k5() == 4) {
         y2q var1 = var0.n5(3);
         if (var1 != null) {
            if (com.aspose.slides.internal.v6g.k5.n5(var1.u3(), com.aspose.slides.internal.k0r.u6p.class) != null) {
               List$Enumerator var2 = var0.t2().iterator();

               try {
                  while (var2.hasNext()) {
                     k1z var3 = (k1z)var2.next();
                     if (var3.h0()) {
                        z4m var4 = var3.k7();
                        if (var4 != null) {
                           switch (var4.a6()) {
                              case 15:
                              case 16:
                                 continue;
                              default:
                                 var0.k5(true);
                           }
                        } else {
                           f7q var5 = var3.m1();
                           if (var5 != null) {
                              switch (var5.n5()) {
                                 case 5:
                                 case 6:
                                    continue;
                                 default:
                                    var0.k5(true);
                              }
                           }
                        }

                        if (var0.c4()) {
                           var0.h0().removeItemByKey(3);
                           return;
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
      }
   }

   public static byte n5(com.aspose.slides.internal.k0r.h3d var0) {
      int var1 = var0.h0();
      byte var2 = s1f.k5(var0.h0());
      var0.n5(var1);
      return var2;
   }
}
