package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.exceptions.ArgumentNullException;

class m6q extends e3 {
   private final IGenericDictionary<String, j0v> c8 = new Dictionary<>();
   private final IGenericDictionary<String, FontSubstitutionInfo> t2 = new Dictionary<>();
   private Presentation s7;
   private com.aspose.slides.internal.w0.c8 x8;

   public m6q(Presentation var1) {
      super((com.aspose.slides.internal.o9b.l6)null);
      if (var1 == null) {
         throw new ArgumentNullException("presentation");
      }

      this.s7 = var1;
      this.n5(new com.aspose.slides.internal.w0.c8());
   }

   public final j0v[] n5(int[] var1) {
      this.k5(var1);
      j0v[] var2 = new j0v[this.c8.size()];
      this.c8.getValues().copyToTArray(var2, 0);
      return var2;
   }

   public final FontSubstitutionInfo[] l6(int[] var1) {
      this.k5(var1);
      FontSubstitutionInfo[] var2 = new FontSubstitutionInfo[this.t2.size()];
      this.t2.getValues().copyToTArray(var2, 0);
      return var2;
   }

   private void k5(int[] var1) {
      for (ITextFrame var5 : SlideUtil.n5(this.s7, var1, true)) {
         TextFrame var6 = (TextFrame)var5;
         if (!com.aspose.slides.internal.v6g.k5.l6(var6.k5(), Cell.class)
            && (
               !com.aspose.slides.internal.v6g.k5.l6(var6.k5(), AutoShape.class)
                  || !com.aspose.slides.internal.v6g.k5.l6(((AutoShape)var6.k5()).p3(), SmartArt.class)
                     && (
                        !((AutoShape)var6.k5()).isTextHolder()
                           || !com.aspose.slides.internal.v6g.k5.l6(((AutoShape)var6.k5()).getSlide(), LayoutSlide.class)
                              && !com.aspose.slides.internal.v6g.k5.l6(((AutoShape)var6.k5()).getSlide(), MasterSlide.class)
                     )
            )) {
            s3z.n5(var6.u3, null);
            var6.u3.n5(this, null);
         }
      }
   }

   @Override
   protected com.aspose.slides.internal.w0.c8 n3() {
      return this.x8;
   }

   @Override
   protected void n5(com.aspose.slides.internal.w0.c8 var1) {
      this.x8 = var1;
   }

   @Override
   public float c8() {
      return (Float)com.aspose.slides.internal.v6g.k5.k5(float.class);
   }

   @Override
   public float t2() {
      return (Float)com.aspose.slides.internal.v6g.k5.k5(float.class);
   }

   @Override
   public int s7() {
      return (Integer)com.aspose.slides.internal.v6g.k5.k5(int.class);
   }

   @Override
   public int x8() {
      return (Integer)com.aspose.slides.internal.v6g.k5.k5(int.class);
   }

   @Override
   public void n5(com.aspose.slides.internal.x4g.s7 var1, l6v var2, a1v var3) {
   }

   @Override
   public void n5(com.aspose.slides.internal.o9b.t4 var1, int var2, int var3) {
   }

   @Override
   public void n5(com.aspose.slides.internal.o9b.t4 var1, int var2, int var3, int var4, int var5) {
   }

   @Override
   public void n5(com.aspose.slides.internal.o9b.t4 var1, float var2, float var3) {
   }

   @Override
   public void n5(com.aspose.slides.internal.o9b.t4 var1, float var2, float var3, float var4, float var5) {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.o9b.y1 var2, TextParam var3) {
      if (!var3.s3()) {
         if (!this.c8.containsKey(var3.z3())) {
            e4z var4 = var3.d2();
            j0v var5 = new j0v(var4.l6(), var3.y2(), var3.z3());
            this.c8.addItem(var3.z3(), var5);
         }

         if (!this.t2.containsKey(var3.y2()) && !com.aspose.slides.ms.System.d1.a6(var3.y2(), var3.z3())) {
            this.t2.addItem(var3.y2(), new FontSubstitutionInfo(var3.y2(), var3.z3()));
         }
      }
   }

   @Override
   public void n5(IPPImage var1, com.aspose.slides.internal.o9b.y1 var2, com.aspose.slides.internal.o9b.y1 var3, a6l var4) {
   }

   @Override
   com.aspose.slides.internal.o9b.y1 t9() {
      return (com.aspose.slides.internal.o9b.y1)com.aspose.slides.internal.v6g.k5.k5(com.aspose.slides.internal.o9b.y1.class);
   }

   @Override
   void n5(com.aspose.slides.internal.o9b.y1 var1) {
   }
}
