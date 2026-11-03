package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.Dictionary$ValueCollection$Enumerator;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public abstract class BaseSlideHeaderFooterManager extends BaseHeaderFooterManager {
   private final BaseSlide n5;

   public final boolean isFooterVisible() {
      return this.l6((byte)6);
   }

   public final boolean isSlideNumberVisible() {
      return this.l6((byte)5);
   }

   public final boolean isDateTimeVisible() {
      return this.l6((byte)4);
   }

   public final void setFooterVisibility(boolean isVisible) {
      this.n5((byte)6, isVisible);
   }

   public final void setSlideNumberVisibility(boolean isVisible) {
      this.n5((byte)5, isVisible);
   }

   public final void setDateTimeVisibility(boolean isVisible) {
      this.n5((byte)4, isVisible);
   }

   public final void setFooterText(String text) {
      this.n5((byte)6, text, false);
   }

   public final void setDateTimeText(String text) {
      this.n5((byte)4, text, true);
   }

   final BaseSlide n5() {
      return this.n5;
   }

   final boolean l6() {
      AutoShape var1 = com.aspose.slides.internal.v6g.k5.n5(this.n5.n5((byte)4), AutoShape.class);
      return var1 != null ? !var1.k5() : false;
   }

   final String k5() {
      return this.a6((byte)4);
   }

   final void n5(String var1) {
      IGenericEnumerator var2 = this.n5().getShapes().iterator();

      try {
         while (var2.hasNext()) {
            IShape var3 = (IShape)var2.next();
            AutoShape var4 = com.aspose.slides.internal.v6g.k5.n5(var3, AutoShape.class);
            if (var4 != null && var4.getPlaceholder() != null && var4.getPlaceholder().getType() == 5) {
               ITextFrame var5 = var4.addTextFrame(var1);
               var5.getParagraphs().get_Item(0).getPortions().get_Item(0).addField(FieldType.getSlideNumber());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   final void u3() {
      for (int var1 = this.n5().getShapes().size() - 1; var1 >= 0; var1--) {
         IShape var2 = this.n5().getShapes().get_Item(var1);
         if (var2.getPlaceholder() != null && (var2.getPlaceholder().getIndex() & 4294967295L) != 4294967295L) {
            ((Placeholder)var2.getPlaceholder()).n5(4294967295L);
         }
      }
   }

   final void n5(BaseSlide var1, boolean var2, boolean var3) {
      Dictionary var4 = new Dictionary();
      List var5 = new List();
      IGenericEnumerator var6 = var1.getShapes().iterator();

      try {
         while (var6.hasNext()) {
            IShape var7 = (IShape)var6.next();
            IPlaceholder var8 = var7.getPlaceholder();
            if (var8 != null && (var8.getIndex() & 4294967295L) != 4294967295L) {
               var4.addItem(var8.getIndex(), var8.getType());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }

      IGenericEnumerator var46 = this.n5().getShapes().iterator();

      try {
         while (var46.hasNext()) {
            IShape var47 = (IShape)var46.next();
            IPlaceholder var9 = var47.getPlaceholder();
            if (var9 != null && (var9.getIndex() & 4294967295L) != 4294967295L) {
               if (var4.containsKey(var9.getIndex()) && var9.getType() == (Byte)var4.get_Item(var9.getIndex())) {
                  var4.removeItemByKey(var9.getIndex());
                  if (var3) {
                     ((Shape)var47).v0();
                  }
               } else if (var9.getType() != 8) {
                  var5.addItem(var9);
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var46, IDisposable.class)) {
            var46.dispose();
         }
      }

      List$Enumerator var49 = var5.iterator();

      try {
         while (var49.hasNext()) {
            IPlaceholder var10 = (IPlaceholder)var49.next();
            boolean var48 = false;
            Dictionary$Enumerator var11 = var4.iterator();

            try {
               while (var11.hasNext()) {
                  KeyValuePair var12 = (KeyValuePair)var11.next();
                  if ((Byte)var12.getValue() == var10.getType()) {
                     if (!n5(var10.getType()) || (var10.getIndex() & 4294967295L) < 10L) {
                        ((Placeholder)var10).n5((Long)var12.getKey());
                     }

                     var4.removeItemByKey(var12.getKey());
                     var48 = true;
                     break;
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var11, IDisposable.class)) {
                  var11.dispose();
               }
            }

            if (!var48) {
               ((Placeholder)var10).n5(4294967295L);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var49, IDisposable.class)) {
            var49.dispose();
         }
      }

      if (var2) {
         Dictionary$ValueCollection$Enumerator var50 = var4.getValues().iterator();

         try {
            while (var50.hasNext()) {
               byte var51 = com.aspose.slides.internal.v6g.k5.u3(var50.next(), byte.class);
               if (!n5(var51)) {
                  n5(this.n5(), var1, var51);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var50, IDisposable.class)) {
               var50.dispose();
            }
         }
      }
   }

   static boolean n5(byte var0) {
      switch (var0) {
         case 4:
         case 5:
         case 6:
         case 7:
            return true;
         default:
            return false;
      }
   }

   BaseSlideHeaderFooterManager(BaseSlide baseSlide) {
      super(baseSlide.z1());
      this.n5 = baseSlide;
   }

   final boolean l6(byte var1) {
      return this.n5.n5(var1) != null;
   }

   abstract void k5(byte var1);

   final void u3(byte var1) {
      n5(this.n5(), var1);
   }

   final void n5(byte var1, boolean var2) {
      if (var2) {
         if (!this.l6(var1)) {
            this.k5(var1);
         }
      } else {
         this.u3(var1);
      }
   }

   final void n5(byte var1, String var2, boolean var3) {
      IGenericEnumerator var4 = this.n5().getShapes().iterator();

      try {
         while (var4.hasNext()) {
            IShape var5 = (IShape)var4.next();
            AutoShape var6 = com.aspose.slides.internal.v6g.k5.n5(var5, AutoShape.class);
            if (var6 != null && var6.getPlaceholder() != null && var6.getPlaceholder().getType() == var1) {
               ITextFrame var7 = var6.addTextFrame(var2);
               if (var3) {
                  var7.getParagraphs().get_Item(0).getPortions().get_Item(0).removeField();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }
   }

   private String a6(byte var1) {
      AutoShape var2 = com.aspose.slides.internal.v6g.k5.n5(this.n5.n5(var1), AutoShape.class);
      return var2 != null && var2.getTextFrame() != null ? var2.getTextFrame().getText() : null;
   }
}
