package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.ms.System.IDisposable;

public class PresentationHeaderFooterManager extends BaseHeaderFooterManager implements IPresentationHeaderFooterManager {
   private final Presentation n5;
   private boolean l6;
   private boolean k5;
   private boolean u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9(
      "datetime1",
      "datetime2",
      "datetime3",
      "datetime4",
      "datetime5",
      "datetime6",
      "datetime7",
      "datetime8",
      "datetime9",
      "datetime10",
      "datetime11",
      "datetime12",
      "datetime13",
      "datetime14"
   );

   @Override
   public final void setAllHeadersVisibility(boolean isVisible) {
      this.n5((byte)7, isVisible);
   }

   @Override
   public final void setAllFootersVisibility(boolean isVisible) {
      this.n5((byte)6, isVisible);
      this.l6 = isVisible;
      this.a6();
   }

   @Override
   public final void setAllSlideNumbersVisibility(boolean isVisible) {
      this.n5((byte)5, isVisible);
      this.k5 = isVisible;
      this.a6();
   }

   @Override
   public final void setAllDateTimesVisibility(boolean isVisible) {
      this.n5((byte)4, isVisible);
      this.u3 = isVisible;
      this.a6();
   }

   @Override
   public final void setAllHeadersText(String text) {
      this.k5((byte)7, text, false);
   }

   @Override
   public final void setAllFootersText(String text) {
      this.k5((byte)6, text, false);
   }

   @Override
   public final void setAllDateTimesText(String text) {
      this.k5((byte)4, text, true);
   }

   @Override
   public final void setVisibilityOnAllTitleSlides(boolean isVisible) {
      IGenericEnumerator var2 = this.n5.getMasters().iterator();

      try {
         while (var2.hasNext()) {
            IMasterSlide var3 = (IMasterSlide)var2.next();
            if (var3.getLayoutSlides().size() > 0) {
               ILayoutSlide var4 = var3.getLayoutSlides().get_Item(0);
               if (isVisible && var4.getMasterSlide() != null) {
                  var3.getHeaderFooterManager().setFooterVisibility(true);
                  var3.getHeaderFooterManager().setDateTimeVisibility(true);
                  var3.getHeaderFooterManager().setSlideNumberVisibility(true);
               }

               var4.getHeaderFooterManager().setFooterAndChildFootersVisibility(isVisible);
               var4.getHeaderFooterManager().setDateTimeAndChildDateTimesVisibility(isVisible);
               var4.getHeaderFooterManager().setSlideNumberAndChildSlideNumbersVisibility(isVisible);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   PresentationHeaderFooterManager(Presentation parentImmediate) {
      super(parentImmediate);
      this.n5 = parentImmediate;
   }

   final void n5() {
      IMasterSlideCollection var1 = this.n5.getMasters();
      if (var1 != null && var1.size() > 0) {
         l4x var2 = ((MasterSlide)var1.get_Item(0)).t4().c8();
         if (var2 != null) {
            this.l6 = var2.l6();
            this.u3 = var2.n5();
            this.k5 = var2.u3();
         }
      }
   }

   final void l6() {
      this.n5(0);
   }

   final void n5(int var1) {
      if (this.n5 != null) {
         int var2 = this.n5.getFirstSlideNumber();
         ISlideCollection var3 = this.n5.getSlides();
         if (var1 < var3.size()) {
            for (int var4 = var1; var4 < var3.size(); var4++) {
               ISlide var5 = var3.get_Item(var4);
               n5(var5, var4 + var2);
            }

            try {
               for (int var7 = var1; var7 < var3.size(); var7++) {
                  BaseSlide var8 = (BaseSlide)var3.get_Item(var7).getNotesSlideManager().getNotesSlide();
                  if (var8 != null) {
                     n5(var8, var7 + var2);
                  }
               }
            } catch (RuntimeException var6) {
               com.aspose.slides.internal.n8e.v4.n5(var6);
            }
         }
      }
   }

   final void k5() {
      if (this.n5 != null) {
         ISlideCollection var1 = this.n5.getSlides();

         for (int var2 = 0; var2 < var1.size(); var2++) {
            n5(var1.get_Item(var2));
         }

         try {
            for (int var5 = 0; var5 < this.n5.getSlides().size(); var5++) {
               BaseSlide var3 = (BaseSlide)this.n5.getSlides().get_Item(var5).getNotesSlideManager().getNotesSlide();
               if (var3 != null) {
                  n5(var3);
               }
            }
         } catch (RuntimeException var4) {
            com.aspose.slides.internal.n8e.v4.n5(var4);
         }
      }
   }

   final void n5(byte var1, String var2, boolean var3) {
      IGenericEnumerator var4 = this.n5.getMasters().iterator();

      try {
         while (var4.hasNext()) {
            IMasterSlide var5 = (IMasterSlide)var4.next();
            n5(var1, var2, (BaseSlide)var5, var3);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      IGenericEnumerator var21 = this.n5.getLayoutSlides().iterator();

      try {
         while (var21.hasNext()) {
            ILayoutSlide var6 = (ILayoutSlide)var21.next();
            n5(var1, var2, (BaseSlide)var6, var3);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var21, IDisposable.class)) {
            var21.dispose();
         }
      }

      IGenericEnumerator var22 = this.n5.getSlides().iterator();

      try {
         while (var22.hasNext()) {
            ISlide var7 = (ISlide)var22.next();
            n5(var1, var2, (BaseSlide)var7, var3);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var22, IDisposable.class)) {
            var22.dispose();
         }
      }
   }

   final void l6(byte var1, String var2, boolean var3) {
      n5(var1, var2, (BaseSlide)this.n5.getMasterNotesSlideManager().getMasterNotesSlide(), var3);
      IGenericEnumerator var4 = this.n5.getSlides().iterator();

      try {
         while (var4.hasNext()) {
            ISlide var5 = (ISlide)var4.next();
            if (var5.getNotesSlideManager().getNotesSlide() != null) {
               n5(var1, var2, (BaseSlide)var5.getNotesSlideManager().getNotesSlide(), var3);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }
   }

   static void n5(byte var0, String var1, BaseSlide var2, boolean var3) {
      AutoShape var4 = com.aspose.slides.internal.v6g.k5.n5(var2.n5(var0), AutoShape.class);
      if (var4 != null) {
         if (var0 == 6
            && var4.getTextFrame() != null
            && var4.getTextFrame().getParagraphs().get_Item(0).getPortions().getCount() > 0
            && var4.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getField() != null
            && FieldType.op_Inequality(
               (FieldType)var4.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getField().getType(), FieldType.getFooter()
            )) {
            return;
         }

         if (var4.getTextFrame() == null) {
            var4.addTextFrame("");
         }

         Portion var5 = null;
         FieldType var6 = null;
         IGenericEnumerator var7 = var4.getTextFrame().getParagraphs().iterator();

         try {
            while (var7.hasNext()) {
               IParagraph var8 = (IParagraph)var7.next();
               IGenericEnumerator var9 = var8.getPortions().iterator();

               try {
                  while (var9.hasNext()) {
                     IPortion var10 = (IPortion)var9.next();
                     if (var10.getField() != null) {
                        var5 = (Portion)var10;
                        var6 = (FieldType)var5.getField().getType();
                        break;
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
                     var9.dispose();
                  }
               }

               if (var5 != null) {
                  break;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
               var7.dispose();
            }
         }

         if (var5 == null) {
            return;
         }

         if (var3) {
            var5.removeField();
         }

         if (com.aspose.slides.ms.System.d1.n5(var1)) {
            if (var3 && FieldType.op_Equality(var6, FieldType.getFooter()) && var5.n3() != null) {
               var5.n3().getPortions().remove(var5);
            } else {
               var5.setText(com.aspose.slides.ms.System.d1.n5);
            }
         } else {
            var5.setText(com.aspose.slides.internal.n8e.v4.l6(var1));
         }
      }
   }

   final void n5(byte var1, boolean var2, boolean var3) {
      for (int var4 = 0; var4 < this.n5.getSlides().size(); var4++) {
         Slide var5 = (Slide)this.n5.getSlides().get_Item(var4);
         if (var2) {
            if (var5.getNotesSlideManager().getNotesSlide() != null) {
               this.n5((BaseSlide)var5.getNotesSlideManager().getNotesSlide(), var1, var3);
            }
         } else {
            this.n5(var5, var1, var3);
         }
      }
   }

   final void n5(BaseSlide var1, byte var2, boolean var3) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1, Slide.class)) {
         IGenericEnumerator var4 = ((Slide)var1).w1().getShapes().iterator();

         try {
            while (var4.hasNext()) {
               Shape var5 = (Shape)var4.next();
               if (var5.getPlaceholder() != null && var2 == var5.getPlaceholder().getType()) {
                  if (var3) {
                     n5(var1, ((Slide)var1).w1(), var2);
                  } else {
                     n5(var1, var2);
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var1, NotesSlide.class)) {
         IGenericEnumerator var14 = ((NotesSlide)var1).getPresentation().getMasterNotesSlideManager().getMasterNotesSlide().getShapes().iterator();

         try {
            while (var14.hasNext()) {
               Shape var15 = (Shape)var14.next();
               if (var15.getPlaceholder() != null && var2 == var15.getPlaceholder().getType()) {
                  if (var3) {
                     n5(var1, (BaseSlide)((NotesSlide)var1).getPresentation().getMasterNotesSlideManager().getMasterNotesSlide(), var2);
                  } else {
                     n5(var1, var2);
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
               var14.dispose();
            }
         }
      }
   }

   final void n5(Slide var1, BaseSlide var2) {
      if (var1 != null && var2 != null) {
         boolean var3 = (var1.getLayoutSlide().getSlideId() & 4294967295L) != (this.u3() & 4294967295L) || this.n5.n3().t2();
         List var4 = new List();
         IGenericEnumerator var5 = var2.getShapes().iterator();

         try {
            while (var5.hasNext()) {
               Shape var6 = (Shape)var5.next();
               if (var6.getPlaceholder() != null) {
                  byte var7 = var6.getPlaceholder().getType();
                  if (var7 == 6 ? this.l6 && var3 : (var7 == 5 ? this.k5 && var3 : var7 != 4 || this.u3 && var3)) {
                     boolean var8 = false;
                     IGenericEnumerator var9 = var1.getShapes().iterator();

                     try {
                        while (var9.hasNext()) {
                           Shape var10 = (Shape)var9.next();
                           if (var10.getPlaceholder() != null) {
                              if (var10.getPlaceholder().getType() == var7 && var10.getPlaceholder().getIndex() == var6.getPlaceholder().getIndex()) {
                                 var8 = true;
                                 break;
                              }

                              if (var10.getPlaceholder().getType() == var7 && var10.getPlaceholder().getIndex() == 4294967295L) {
                                 var1.l6.n5(var10);
                                 var10.addPlaceholder(var6.getPlaceholder());
                                 var8 = true;
                                 break;
                              }
                           }
                        }
                     } finally {
                        if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
                           var9.dispose();
                        }
                     }

                     if (!var8) {
                        var4.addItem(var6);
                     }
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
               var5.dispose();
            }
         }

         List$Enumerator var35 = var4.iterator();

         try {
            while (var35.hasNext()) {
               Shape var36 = (Shape)var35.next();
               IGenericEnumerator var37 = var1.getShapes().iterator();

               try {
                  while (var37.hasNext()) {
                     Shape var38 = (Shape)var37.next();
                     if (var38.getPlaceholder() != null && var38.getPlaceholder().getIndex() == 4294967295L) {
                        var1.l6.n5(var38);
                        var38.addPlaceholder(var36.getPlaceholder());
                        break;
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var37, IDisposable.class)) {
                     var37.dispose();
                  }
               }

               n5(var1, var36);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var35, IDisposable.class)) {
               var35.dispose();
            }
         }

         n5(var1);
      }
   }

   final long u3() {
      return this.n5 != null && this.n5.getLayoutSlides().size() > 0 ? ((LayoutSlide)this.n5.getLayoutSlides().get_Item(0)).t4().u3() : 0L;
   }

   static String n5(String var0, String var1) {
      com.aspose.slides.internal.x7n.l6 var2;
      if (var1 == null) {
         var2 = com.aspose.slides.internal.x7n.l6.n5("en-us");
      } else {
         try {
            var2 = com.aspose.slides.internal.x7n.l6.n5(var1);
         } catch (ArgumentException var7) {
            var2 = com.aspose.slides.internal.x7n.l6.n5("en-us");
         }
      }

      com.aspose.slides.internal.x7n.u3 var3 = var2.a6();
      String var4 = var3.q0();
      switch (a6.n5(var0)) {
         case 0:
            if ("ja-jp".equals(com.aspose.slides.ms.System.d1.u9(var2.toString()))) {
               var4 = "yyyy/M/d";
            }
            break;
         case 1:
            var4 = var3.t4();
            break;
         case 2:
            var4 = "dd MMMM yyyy";
            break;
         case 3:
            boolean var5 = false;
            if (var3.t4().charAt(0) == '\'') {
               int var6 = com.aspose.slides.ms.System.d1.l6(var3.t4(), '\'', 1);
               if (var6 > 0) {
                  var4 = com.aspose.slides.ms.System.d1.k5(var3.t4(), var6 + 1);
                  var5 = true;
               }
            }

            if (!var5) {
               for (int var8 = 0; var8 < var3.t4().length(); var8++) {
                  if (var3.t4().charAt(var8) == ' ') {
                     var4 = var3.t4();
                     var5 = true;
                     break;
                  }
               }
            }

            if (!var5) {
               var4 = "MMMM dd, yyyy";
            }
            break;
         case 4:
            var4 = "dd'-'MMM'-'yy";
            break;
         case 5:
            var4 = "MMMM yy";
            break;
         case 6:
            var4 = "MMM'-'yy";
            break;
         case 7:
            if (var2.t2() != 2052 && var2.t2() != 4100) {
               var4 = com.aspose.slides.ms.System.d1.n5("{0} {1}",new Object[]{ var3.q0(), var3.z3()});
            } else {
               var4 = com.aspose.slides.ms.System.d1.n5("{0}{1}",new Object[]{ var3.t4(), "h时m分"});
            }
            break;
         case 8:
            if (var2.t2() != 2052 && var2.t2() != 4100) {
               var4 = com.aspose.slides.ms.System.d1.n5("{0} {1}",new Object[]{ var3.q0(), var3.m1()});
            } else {
               var4 = com.aspose.slides.ms.System.d1.n5("{0}{1}{2}",new Object[]{ var3.t4(), "dddd", "h时m分s秒"});
            }
            break;
         case 9:
            var4 = "HH:mm";
            break;
         case 10:
            var4 = "HH:mm:ss";
            break;
         case 11:
            if (var2.t2() != 2052 && var2.t2() != 4100) {
               var4 = "h:mm tt";
            } else {
               var4 = com.aspose.slides.ms.System.d1.n5("{0}{1}",new Object[]{ "tt", "h时m分"});
            }
            break;
         case 12:
            if (var2.t2() != 2052 && var2.t2() != 4100) {
               var4 = "h:mm:ss tt";
            } else {
               var4 = com.aspose.slides.ms.System.d1.n5("{0}{1}",new Object[]{ "tt", "h时m分s秒"});
            }
            break;
         case 13:
            var4 = "yyyy/M/d (ddd)";
            if (com.aspose.slides.ms.System.d1.u3(var2.s7(), "ja-JP", (short)5)) {
               var4 = "yyyy年M月d日(ddd)";
            }
      }

      return com.aspose.slides.ms.System.j5.s7().n5(var4, var2);
   }

   private void a6() {
      IGenericEnumerator var1 = this.n5.getMasters().iterator();

      try {
         while (var1.hasNext()) {
            MasterSlide var2 = (MasterSlide)var1.next();
            this.n5(var2.t4().c8());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      IGenericEnumerator var11 = this.n5.getLayoutSlides().iterator();

      try {
         while (var11.hasNext()) {
            LayoutSlide var3 = (LayoutSlide)var11.next();
            var3.t4().x8().u9();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var11, IDisposable.class)) {
            var11.dispose();
         }
      }
   }

   private void n5(l4x var1) {
      if (var1 != null) {
         var1.l6(this.l6);
         var1.n5(this.u3);
         var1.u3(this.k5);
      }
   }

   private static void n5(IBaseSlide var0, int var1) {
      IShapeCollection var2 = var0.getShapes();
      IGenericEnumerator var3 = var2.iterator();

      try {
         while (var3.hasNext()) {
            Shape var4 = (Shape)var3.next();
            AutoShape var5 = com.aspose.slides.internal.v6g.k5.n5(var4, AutoShape.class);
            if (var5 != null && var5.getPlaceholder() != null && var5.getPlaceholder().getType() == 5) {
               IGenericEnumerator var6 = var5.getTextFrame().getParagraphs().get_Item(0).getPortions().iterator();

               try {
                  while (var6.hasNext()) {
                     Portion var7 = (Portion)var6.next();
                     if (var7.k5() && FieldType.op_Equality((FieldType)var7.getField().getType(), FieldType.getSlideNumber())) {
                        var7.setText(com.aspose.slides.ms.System.a3.n5(var1, com.aspose.slides.internal.x7n.l6.k5()));
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
                     var6.dispose();
                  }
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   private static void n5(IBaseSlide var0) {
      IShapeCollection var1 = var0.getShapes();
      IGenericEnumerator var2 = var1.iterator();

      try {
         while (var2.hasNext()) {
            Shape var3 = (Shape)var2.next();
            AutoShape var4 = com.aspose.slides.internal.v6g.k5.n5(var3, AutoShape.class);
            if (var4 != null && var4.getTextFrame() != null) {
               IGenericEnumerator var5 = var4.getTextFrame().getParagraphs().iterator();

               try {
                  while (var5.hasNext()) {
                     Paragraph var6 = (Paragraph)var5.next();
                     IGenericEnumerator var7 = var6.getPortions().iterator();

                     try {
                        while (var7.hasNext()) {
                           Portion var8 = (Portion)var7.next();
                           if (var8.k5() && com.aspose.slides.ms.System.d1.l6(var8.getField().getType().getInternalString(), "datetime")) {
                              n5(var8);
                           }
                        }
                     } finally {
                        if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
                           var7.dispose();
                        }
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

   private static void n5(Portion var0) {
      if (var0 != null && var0.getField() != null && FieldType.l6().containsItem((FieldType)var0.getField().getType())) {
         String var1 = var0.getField().getType().getInternalString();
         var0.setText(n5(var1, null));
      }
   }

   private void n5(byte var1, boolean var2) {
      if (var1 != 7) {
         IGenericEnumerator var3 = this.n5.getMasters().iterator();

         try {
            while (var3.hasNext()) {
               IMasterSlide var4 = (IMasterSlide)var3.next();
               ((MasterSlideHeaderFooterManager)var4.getHeaderFooterManager()).l6(var1, var2);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }
      }

      IMasterNotesSlide var8 = this.n5.getMasterNotesSlideManager().getMasterNotesSlide();
      if (var8 != null) {
         ((MasterNotesSlideHeaderFooterManager)var8.getHeaderFooterManager()).l6(var1, var2);
      }

      IMasterHandoutSlide var9 = this.n5.getMasterHandoutSlideManager().getMasterHandoutSlide();
      if (var9 != null) {
         ((MasterHandoutSlideHeaderFooterManager)var9.getHeaderFooterManager()).n5(var1, var2);
      }
   }

   private void k5(byte var1, String var2, boolean var3) {
      if (var1 != 7) {
         IGenericEnumerator var4 = this.n5.getMasters().iterator();

         try {
            while (var4.hasNext()) {
               IMasterSlide var5 = (IMasterSlide)var4.next();
               ((MasterSlideHeaderFooterManager)var5.getHeaderFooterManager()).l6(var1, var2, var3);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }
      }

      IMasterNotesSlide var9 = this.n5.getMasterNotesSlideManager().getMasterNotesSlide();
      if (var9 != null) {
         ((MasterNotesSlideHeaderFooterManager)var9.getHeaderFooterManager()).l6(var1, var2, var3);
      }

      IMasterHandoutSlide var10 = this.n5.getMasterHandoutSlideManager().getMasterHandoutSlide();
      if (var10 != null) {
         ((MasterHandoutSlideHeaderFooterManager)var10.getHeaderFooterManager()).n5(var1, var2, var3);
      }
   }
}
