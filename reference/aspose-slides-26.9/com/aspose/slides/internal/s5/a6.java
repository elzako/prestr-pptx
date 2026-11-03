package com.aspose.slides.internal.s5;

public class a6 {
   private final com.aspose.slides.internal.p1s.n5 n5;
   private final com.aspose.slides.internal.p1s.n5 l6;

   public final com.aspose.slides.internal.p1s.n5 n5() {
      return this.n5;
   }

   public final com.aspose.slides.internal.p1s.n5 l6() {
      return this.l6;
   }

   public final boolean n5(com.aspose.slides.internal.p1s.n5 var1) {
      return var1.k5() >= this.n5().k5()
         && var1.k5() <= this.l6().k5()
         && var1.u3() >= this.n5().u3()
         && var1.u3() <= this.l6().u3()
         && var1.a6() >= this.n5().a6()
         && var1.a6() <= this.l6().a6();
   }

   @Override
   public int hashCode() {
      return this.n5.hashCode() * 397 ^ this.l6.hashCode();
   }

   // BUILD-ONLY: mandatory constructorless normalization removes this entire member.
   private a6(com.aspose.slides.internal.p1s.n5 recoveryArg0, com.aspose.slides.internal.p1s.n5 recoveryArg1) {
      super();
      this.n5 = recoveryArg0;
      this.l6 = recoveryArg1;
   }
}
