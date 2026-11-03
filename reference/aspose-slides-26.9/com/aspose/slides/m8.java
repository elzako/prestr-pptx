package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;

class m8 extends x8<Background, m8> implements IBackgroundEffectiveData {
   private byte k5;
   private f6a u3 = new f6a(this);
   private f6a a6;
   private final f6a u9 = f6a.y4();
   private final d0e h0 = new d0e(this);
   private final j3z c8;
   private int t2;
   private IShape s7;
   private static final m8 x8 = c8();

   m8(Background var1) {
      super(var1);
      this.k5 = -1;
      this.c8 = new j3z();
      this.t2 = 0;
   }

   @Override
   public final IFillFormatEffectiveData getFillFormat() {
      if (this.k5 == 1) {
         return this.u3;
      } else if (this.k5 == 0) {
         return this.a6;
      } else {
         throw new Exception("Unknown/NotDefined effective background type.");
      }
   }

   @Override
   public final IEffectFormatEffectiveData getEffectFormat() {
      return this.h0;
   }

   final byte u9() {
      return this.k5;
   }

   final IShape h0() {
      return this.s7;
   }

   private static m8 c8() {
      m8 var0 = new m8((Background)null);
      var0.k5 = 1;
      var0.u3 = f6a.z1();
      return var0;
   }

   static m8 n5(Background var0) {
      IPresentationComponent var1 = var0.getParent_IPresentationComponent();
      BaseSlide var2 = null;
      if (com.aspose.slides.internal.v6g.k5.l6(var1, Slide.class)) {
         var2 = ((Slide)var1).w1();
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, NotesSlide.class)) {
         var2 = (BaseSlide)((NotesSlide)var1).z1().getMasterNotesSlideManager().getMasterNotesSlide();
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, LayoutSlide.class)) {
         var2 = (BaseSlide)((LayoutSlide)var1).getMasterSlide();
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, MasterSlide.class)
         || com.aspose.slides.internal.v6g.k5.l6(var1, MasterNotesSlide.class)
         || com.aspose.slides.internal.v6g.k5.l6(var1, MasterHandoutSlide.class)) {
         return x8;
      }

      return var2 != null ? ((Background)var2.getBackground()).h0() : x8;
   }

   void n5(i7b var1, Background var2) {
      m8 var3 = (m8)var1;
      this.k5 = var3.k5;
      this.u3.n5((i7b)var3.u3);
      this.h0.n5((i7b)var3.h0);
      this.t2 = var3.t2;
      this.s7 = var3.s7;
      boolean var4 = var2.getType() != -1;
      ColorFormat var5 = null;
      if (var4) {
         var5 = (ColorFormat)var2.getStyleColor();
         this.u3.k5((FillFormat)var2.getFillFormat());
      }

      if (var2.getType() == 1) {
         this.h0.l6((EffectFormat)var2.getEffectFormat());
      } else if (var2.getType() == 0) {
         this.h0.l6(new EffectFormat(var2));
      }

      if (var4) {
         if (var2.getType() != -1) {
            this.k5 = var2.getType();
         }

         if ((var2.getStyleIndex() & 65535) != 0) {
            this.t2 = var2.getStyleIndex();
         }

         this.s7 = var2.u3().u3();
      }

      this.c8.n5(var3.c8, var5);
   }

   @Override
   void n5(IBaseSlide var1, w6a var2) {
      this.u3.n5(var1, var2);
      this.h0.n5(var1, var2);
      this.c8.n5(var1, var2);
      if (this.k5 == 0) {
         if ((this.t2 & 65535) > 0) {
            l3m var3 = (l3m)var1.createThemeEffective().getFormatScheme();
            this.a6 = (f6a)var3.n5(var1, this.c8.n5().o8()).get_Item((this.t2 & 65535) - 1);
         } else {
            this.a6 = this.u9;
            this.u9.n5(var1, var2);
         }
      }
   }

   boolean n5(m8 var1) {
      if (var1 == null) {
         return false;
      } else {
         return this.u9() != var1.u9() ? false : this.getFillFormat().equals(var1.getFillFormat());
      }
   }

   @Override
   boolean n5(g8 recoveredArg) {
      return this.n5((com.aspose.slides.m8)recoveredArg);
   }
}
