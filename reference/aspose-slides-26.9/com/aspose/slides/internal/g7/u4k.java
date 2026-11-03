package com.aspose.slides.internal.g7;

public abstract class u4k extends s7k {
   protected float n5;
   protected l4o l6;
   protected h3d k5;

   public u4k(g9t var1, long var2, long var4, long var6) {
      super(var1, var2, var4, var6);
   }

   public final l4o n5() {
      return this.l6;
   }

   public final h3d l6() {
      return this.k5;
   }

   @Override
   public void n5(f3c var1) {
      var1.n5(this.d2() & 4294967295L);

      try {
         this.n5 = var1.u3();
         int var2 = var1.n3();
         int var3 = var1.n3();
         int var4 = var1.n3();
         this.l6 = f1s.n5(new l4o((this.d2() & 4294967295L) + (var2 & 65535) & 4294967295L), var1);
         this.k5 = f1s.n5(new h3d((this.d2() & 4294967295L) + (var3 & 65535) & 4294967295L), var1);
         this.n5(var4, var1);
         super.n5(var1);
      } catch (q9u var5) {
      } catch (d9m var6) {
      } catch (RuntimeException var7) {
         throw var7;
      }
   }

   public abstract void n5(int var1, f3c var2);
}
