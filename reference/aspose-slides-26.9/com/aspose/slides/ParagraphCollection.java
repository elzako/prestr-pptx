package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.IDisposable;

public final class ParagraphCollection extends DomObject<TextFrame> implements IParagraphCollection {
   private static final ParagraphFormat k5 = new ParagraphFormat(null);
   private final List<IParagraph> u3;
   static final char[] n5 = new char[]{'\r'};
   private com.aspose.slides.ms.System.i1<u5q> a6;
   final com.aspose.slides.internal.v6g.n5<com.aspose.slides.ms.System.i1<u5q>> l6 = new ParagraphCollection$1(this);
   private long h0;

   @Override
   public final int getCount() {
      return this.u3.size();
   }

   public final boolean isReadOnly() {
      return this.u3.isReadOnly();
   }

   @Override
   public final IParagraph get_Item(int index) {
      return this.u3.get_Item(index);
   }

   final IParagraph n5() {
      Paragraph var1 = new Paragraph();
      this.add(var1);
      return var1;
   }

   @Override
   public final void add(IParagraph value) {
      Paragraph var2 = (Paragraph)value;
      if (var2.x8() != null) {
         throw new PptxEditException("Cannot add paragraph that is already added to another collection");
      }

      var2.n5(this);
      if (this.u3.size() > 0) {
         IParagraphFormat var3 = var2.getParagraphFormat();
         IParagraphFormat var4 = this.k5().getParagraphs().get_Item(this.u3.size() - 1).getParagraphFormat();
         if (var4.getBullet().getNumberedBulletStartWith() != -1
            && var3.getBullet().getNumberedBulletStartWith() == -1
            && var4.getBullet().getType() == 2
            && var3.getBullet().getType() == 2) {
            var3.getBullet().setNumberedBulletStartWith(var4.getBullet().getNumberedBulletStartWith());
         }
      }

      this.u3.addItem(var2);
      this.l6();
   }

   @Override
   public final int add(IParagraphCollection value) {
      int var2 = this.getCount();
      if (value.getCount() != 0 && (value.getCount() != 1 || ((Paragraph)value.get_Item(0)).u3().length() != 0)) {
         int var3 = (this.u3.size() + value.getCount() & -16) + 16;
         if (var3 > this.u3.getCapacity()) {
            this.u3.setCapacity(var3);
         }

         IGenericEnumerator var4 = value.iterator();

         try {
            while (var4.hasNext()) {
               Paragraph var5 = (Paragraph)var4.next();
               Paragraph var6 = new Paragraph(var5);
               var6.n5(this);
               this.u3.addItem(var6);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }

         this.l6();
         return var2;
      } else {
         return -1;
      }
   }

   public final int indexOf(IParagraph item) {
      return this.u3.indexOf(item);
   }

   @Override
   public final void insert(int index, IParagraph value) {
      Paragraph var3 = (Paragraph)value;
      if (var3.x8() != null) {
         throw new PptxEditException("Cannot insert paragraph that is already added to another collection");
      }

      var3.n5(this);
      this.u3.insertItem(index, value);
      this.l6();
   }

   @Override
   public final void insert(int index, IParagraphCollection value) {
      if (value.getCount() != 0 && (value.getCount() != 1 || ((Paragraph)value.get_Item(0)).u3().length() != 0)) {
         this.u3.insertRange(index, ((ParagraphCollection)value).u3);
         IGenericEnumerator var3 = value.iterator();

         try {
            while (var3.hasNext()) {
               Paragraph var4 = (Paragraph)var3.next();
               Paragraph var5 = new Paragraph(var4);
               var5.n5(this);
               this.u3.set_Item(index++, var5);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }

         this.l6();
      }
   }

   @Override
   public final void clear() {
      List$Enumerator var1 = this.u3.iterator();

      try {
         while (var1.hasNext()) {
            Paragraph var2 = (Paragraph)var1.next();
            var2.n5((ParagraphCollection)null);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      this.u3.clear();
      this.k5(null);
      this.l6();
   }

   public final boolean contains(IParagraph item) {
      return this.u3.containsItem(item);
   }

   public final void copyTo(IParagraph[] array, int arrayIndex) {
      this.u3.copyToTArray(array, arrayIndex);
   }

   @Override
   public final void removeAt(int index) {
      Paragraph var2 = (Paragraph)this.u3.get_Item(index);
      var2.n5((ParagraphCollection)null);
      this.u3.removeAt(index);
      this.k5(var2);
      this.l6();
   }

   @Override
   public final boolean remove(IParagraph item) {
      int var2 = this.u3.indexOf(item);
      if (var2 < 0) {
         return false;
      }

      this.removeAt(var2);
      return true;
   }

   @Override
   public final IGenericEnumerator<IParagraph> iterator() {
      return this.u3.iterator();
   }

   public final IGenericEnumerator<IParagraph> iteratorJava() {
      return this.u3.iteratorJava();
   }

   final int n5(Paragraph var1) {
      return com.aspose.slides.ms.System.j8.l6(this, var1.x8()) ? this.u3.indexOf(var1) : -1;
   }

   final void l6() {
      this.h0++;
      this.k5().n5.p8();
      this.k5().l6(true);
   }

   final TextFrame k5() {
      return this.u9;
   }

   final long u3() {
      return this.h0;
   }

   final String a6() {
      if (this.getCount() == 0) {
         return "";
      }

      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5(((Paragraph)this.get_Item(0)).u3());

      for (int var2 = 1; var2 < this.getCount(); var2++) {
         var1.n5('\r');
         var1.n5(((Paragraph)this.get_Item(var2)).u3());
      }

      return var1.toString();
   }

   final void n5(String var1) {
      Paragraph var2 = null;
      PortionFormat var3 = null;
      if (this.getCount() > 0) {
         var2 = (Paragraph)this.get_Item(0);
         if (var2.getPortions().getCount() > 0) {
            var3 = (PortionFormat)var2.getPortions().get_Item(0).getPortionFormat();
         } else if (var2.k5() != null) {
            var3 = (PortionFormat)var2.getEndParagraphPortionFormat();
         }

         List$Enumerator var4 = this.u3.iterator();

         try {
            while (var4.hasNext()) {
               Paragraph var5 = (Paragraph)var4.next();
               var5.n5((ParagraphCollection)null);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }

         this.u3.clear();
      }

      int var23 = 0;

      while (var23 < var1.length()) {
         int var24 = com.aspose.slides.ms.System.d1.n5(var1, n5, var23);
         if (var24 < 0) {
            var24 = var1.length();
         }

         Paragraph var6 = new Paragraph();
         var6.getPortions().add(new Portion(com.aspose.slides.ms.System.d1.l6(var1, var23, var24 - var23)));
         this.add(var6);
         if (var24 + 1 < var1.length() && var1.charAt(var24) == '\r' && var1.charAt(var24 + 1) == '\n') {
            var24++;
         }

         var23 = var24 + 1;
      }

      if (this.getCount() == 0) {
         this.add(new Paragraph());
         this.get_Item(0).getPortions().add(new Portion(""));
      }

      this.k5(var2);
      if (var2 != null) {
         IGenericEnumerator var25 = this.iterator();

         try {
            while (var25.hasNext()) {
               Paragraph var26 = (Paragraph)var25.next();
               var26.l6(var2);
               if (var3 != null) {
                  IGenericEnumerator var7 = var26.getPortions().iterator();

                  try {
                     while (var7.hasNext()) {
                        Portion var8 = (Portion)var7.next();
                        var8.l6().n5(var3);
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
                        var7.dispose();
                     }
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var25, IDisposable.class)) {
               var25.dispose();
            }
         }
      }
   }

   @Override
   public final IBaseSlide getSlide() {
      return this.k5().getSlide();
   }

   @Override
   public final IPresentation getPresentation() {
      return this.k5().getPresentation();
   }

   final void l6(Paragraph var1) {
      this.l6();
   }

   @Override
   public final void addFromHtml(String text) {
      this.addFromHtml(text, null, null);
   }

   @Override
   public final void addFromHtml(String text, IExternalResourceResolver resolver, String uri) {
      x3s var4 = new x3s(this, new f7s(resolver), uri, false);
      var4.u3(text);
   }

   @Override
   public final String exportToHtml(int firstParagraphIndex, int paragraphsCount, ITextToHtmlConversionOptions options) {
      if (options == null) {
         options = new TextToHtmlConversionOptions();
      }

      if (firstParagraphIndex >= 0 && firstParagraphIndex < this.getCount()) {
         if (paragraphsCount >= 0 && firstParagraphIndex + paragraphsCount <= this.getCount()) {
            com.aspose.slides.ms.System.o0 var4 = com.aspose.slides.ms.System.o0.l6().k5();

            try {
               r6e.n5(var4.k5());
               Paragraph[] var5 = new Paragraph[paragraphsCount];
               IBaseSlide var6 = this.getSlide();
               r0s var7 = null;
               switch (options.getTextInheritanceLimit()) {
                  case 0:
                     IParagraphFormat[] var14 = this.k5().u9();
                     var7 = this.k5().l6;

                     for (int var19 = 0; var19 < paragraphsCount; var19++) {
                        var5[var19] = ((Paragraph)this.get_Item(firstParagraphIndex + var19))
                           .n5(var14[((Paragraph)this.get_Item(firstParagraphIndex + var19)).getParagraphFormat().getDepth()]);
                     }
                     break;
                  case 1:
                     ParagraphFormat[] var13 = new ParagraphFormat[9];
                     if (com.aspose.slides.internal.v6g.k5.l6(this.k5().getParent_Immediate(), Cell.class)) {
                        c7e var17 = ((Cell)this.k5().getParent_Immediate()).n3().l6();
                        var7 = ((ColorFormat)var17.h0()).l6(var6);

                        for (int var10 = 0; var10 < var13.length; var10++) {
                           var13[var10] = (ParagraphFormat)this.k5().getTextFrameFormat().getTextStyle().getLevel(var10);
                        }
                     } else if (com.aspose.slides.internal.v6g.k5.l6(this.k5().getParent_Immediate(), AutoShape.class)) {
                        for (int var9 = 0; var9 < var13.length; var9++) {
                           var13[var9] = (ParagraphFormat)this.k5().getTextFrameFormat().getTextStyle().getLevel(var9);
                        }
                     }

                     ParagraphFormat var18 = (ParagraphFormat)this.k5().getTextFrameFormat().getTextStyle().getDefaultParagraphFormat();
                     if (var18 == null) {
                        var18 = k5;
                     }

                     for (int var21 = 0; var21 < var13.length; var21++) {
                        if (var13[var21] == null) {
                           var13[var21] = var18;
                        }
                     }

                     for (int var22 = 0; var22 < paragraphsCount; var22++) {
                        var5[var22] = ((Paragraph)this.get_Item(firstParagraphIndex + var22))
                           .n5(var13[((Paragraph)this.get_Item(firstParagraphIndex + var22)).getParagraphFormat().getDepth()]);
                     }
                     break;
                  case 2:
                     for (int var8 = 0; var8 < paragraphsCount; var8++) {
                        var5[var8] = ((Paragraph)this.get_Item(firstParagraphIndex + var8)).n5(k5);
                     }
               }

               for (Paragraph var11 : var5) {
                  var11.n5(this);
               }

               String var16 = v6a.n5(var5, (TextToHtmlConversionOptions)options, (BaseSlide)var6, var7);
               r6e.n5(var4.k5(), var16);
               return var16;
            } catch (RuntimeException var12) {
               r6e.l6(var4.k5());
               throw var12;
            }
         } else {
            throw new ArgumentOutOfRangeException("paragraphsCount");
         }
      } else {
         throw new ArgumentOutOfRangeException("firstParagraphIndex");
      }
   }

   ParagraphCollection(TextFrame parentImmediate) {
      super(parentImmediate);
      this.u3 = new List<>();
   }

   private void k5(Paragraph var1) {
      if (this.a6 != null) {
         this.a6.n5(this, new u5q(var1));
      }
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.i1 n5(ParagraphCollection var0, com.aspose.slides.ms.System.i1 var1) {
      return var0.a6 = var1;
   }
}
