package com.aspose.slides.internal.g7;

public class t5g extends c5q {
   private p6w l6;
   private p6w k5;
   private e8p u3;
   private f6z a6;
   private int u9;

   public t5g(long var1, int var3) {
      super(var1, var3);
   }

   public final p6w l6() {
      return this.l6;
   }

   public final p6w k5() {
      return this.k5;
   }

   public final e8p u3() {
      return this.u3;
   }

   public final f6z a6() {
      return this.a6;
   }

   public String u9() {
      return "Lookup mark to base";
   }

   @Override
   public void n5(f3c var1) {
      if (var1.n5() != ((this.n5 & 4294967295L) + 2L & 4294967295L)) {
         var1.n5((this.n5 & 4294967295L) + 2L & 4294967295L);
      }

      int var2 = var1.n3();
      int var3 = var1.n3();
      this.u9 = var1.n3() & 65535;
      int var4 = var1.n3() & 65535;
      int var5 = var1.n3() & 65535;
      this.l6 = f1s.n5(new p6w(this.n5 & 4294967295L, var2 & 65535), var1);
      this.k5 = f1s.n5(new p6w(this.n5 & 4294967295L, var3 & 65535), var1);
      this.u3 = f1s.n5(new e8p((this.n5 & 4294967295L) + var4 & 4294967295L), var1);
      if (this.u3.l6() != this.l6.a6()) {
         throw new r7c(
            com.aspose.slides.ms.System.d1.n5(
               "Length in glyphs for MarkCoverage={0}and MarkArray={1} differs but must be the same for {2}", this.l6.a6(), this.u3.l6(), this.u9()
            )
         );
      }

      this.a6 = f1s.n5(new f6z((this.n5 & 4294967295L) + var5 & 4294967295L, this.k5.a6(), this.u9), var1);
   }
}
