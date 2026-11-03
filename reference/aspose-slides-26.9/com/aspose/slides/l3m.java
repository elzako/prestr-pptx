package com.aspose.slides;

import java.awt.Color;

final class l3m extends g8<FormatScheme, l3m> implements IFormatSchemeEffectiveData {
   String n5 = null;
   b7i l6;
   n0o k5;
   d8v u3;
   b7i a6;

   l3m() {
      this(null);
   }

   l3m(FormatScheme var1) {
      if (var1 != null) {
         if (!com.aspose.slides.ms.System.d1.n5(var1.l6())) {
            this.n5 = var1.l6();
         }

         this.l6 = new b7i((FillFormatCollection)var1.getFillStyles());
         this.k5 = new n0o((LineFormatCollection)var1.getLineStyles());
         this.u3 = new d8v((EffectStyleCollection)var1.getEffectStyles());
         this.a6 = new b7i((FillFormatCollection)var1.getBackgroundFillStyles());
      } else {
         this.l6 = new b7i();
         this.k5 = new n0o();
         this.u3 = new d8v();
         this.a6 = new b7i();
      }
   }

   @Override
   public final IFillFormatCollectionEffectiveData getFillStyles(Color styleColor) {
      return this.n5(com.aspose.slides.internal.o9b.c8.n5(styleColor));
   }

   IFillFormatCollectionEffectiveData n5(com.aspose.slides.internal.o9b.c8 var1) {
      this.l6.n5(null, new w6a(new r0s(var1.o8()), null));
      return this.l6;
   }

   @Override
   public final ILineFormatCollectionEffectiveData getLineStyles(Color styleColor) {
      return this.l6(com.aspose.slides.internal.o9b.c8.n5(styleColor));
   }

   ILineFormatCollectionEffectiveData l6(com.aspose.slides.internal.o9b.c8 var1) {
      this.k5.n5(null, new w6a(new r0s(var1.o8()), null));
      return this.k5;
   }

   @Override
   public final IEffectStyleCollectionEffectiveData getEffectStyles(Color styleColor) {
      return this.k5(com.aspose.slides.internal.o9b.c8.n5(styleColor));
   }

   IEffectStyleCollectionEffectiveData k5(com.aspose.slides.internal.o9b.c8 var1) {
      this.u3.n5(null, new w6a(new r0s(var1.o8()), null));
      return this.u3;
   }

   @Override
   public final IFillFormatCollectionEffectiveData getBackgroundFillStyles(Color styleColor) {
      return this.u3(com.aspose.slides.internal.o9b.c8.n5(styleColor));
   }

   IFillFormatCollectionEffectiveData u3(com.aspose.slides.internal.o9b.c8 var1) {
      return this.n5(null, var1.o8());
   }

   final IFillFormatCollectionEffectiveData n5(IBaseSlide var1, com.aspose.slides.internal.o9b.c8 var2) {
      this.a6.n5(var1, new w6a(new r0s(var2.o8()), null));
      return this.a6;
   }

   final String n5() {
      return this.n5;
   }

   void n5(i7b var1, FormatScheme var2) {
      l3m var3 = (l3m)var1;
      if (var3 != null) {
         this.n5 = var3.n5;
         this.l6.n5((i7b)var3.l6);
         this.k5.n5((i7b)var3.k5);
         this.u3.n5((i7b)var3.u3);
         this.a6.n5((i7b)var3.a6);
      }

      if (var2 != null) {
         if (!com.aspose.slides.ms.System.d1.n5(var2.l6())) {
            this.n5 = var2.l6();
         }

         if (var2.getFillStyles() != null && var2.getFillStyles().size() > 0) {
            this.l6.n5((FillFormatCollection)var2.getFillStyles());
         }

         if (var2.getLineStyles() != null && var2.getLineStyles().size() > 0) {
            this.k5.n5((LineFormatCollection)var2.getLineStyles());
         }

         if (var2.getEffectStyles() != null && var2.getEffectStyles().size() > 0) {
            this.u3.n5((EffectStyleCollection)var2.getEffectStyles());
         }

         if (var2.getBackgroundFillStyles() != null && var2.getBackgroundFillStyles().size() > 0) {
            this.a6.n5((FillFormatCollection)var2.getBackgroundFillStyles());
         }
      }
   }

   boolean n5(l3m var1) {
      return var1 == null ? false : this.l6.n5(var1.l6) && this.k5.n5(var1.k5) && this.u3.n5(var1.u3) && this.a6.n5(var1.a6);
   }

   @Override
   boolean n5(g8 recoveredArg) {
      return this.n5((com.aspose.slides.l3m)recoveredArg);
   }
}
