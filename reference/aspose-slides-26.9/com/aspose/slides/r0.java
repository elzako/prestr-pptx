package com.aspose.slides;

abstract class r0<TLocalData, TEffectiveData extends r0<TLocalData, TEffectiveData> & IBaseTableFormatEffectiveData>
   extends x8<TLocalData, TEffectiveData>
   implements IBaseTableFormatEffectiveData {
   f6a k5 = new f6a(this);
   t8r u3 = new t8r(this);
   t8r a6 = new t8r(this);
   t8r u9 = new t8r(this);
   t8r h0 = new t8r(this);
   t8r c8 = new t8r(this);
   t8r t2 = new t8r(this);
   t8r s7 = new t8r(this);
   t8r x8 = new t8r(this);

   r0(TLocalData var1) {
      super((TLocalData)var1);
   }

   @Override
   public final IFillFormatEffectiveData getFillFormat() {
      return this.k5;
   }

   @Override
   public final ILineFormatEffectiveData getBorderLeft() {
      return this.u3;
   }

   @Override
   public final ILineFormatEffectiveData getBorderTop() {
      return this.a6;
   }

   @Override
   public final ILineFormatEffectiveData getBorderRight() {
      return this.u9;
   }

   @Override
   public final ILineFormatEffectiveData getBorderBottom() {
      return this.h0;
   }

   @Override
   public final ILineFormatEffectiveData getBorderDiagonalDown() {
      return this.c8;
   }

   @Override
   public final ILineFormatEffectiveData getBorderDiagonalUp() {
      return this.t2;
   }

   final f6a u9() {
      return this.k5;
   }

   final t8r h0() {
      return this.u3;
   }

   final t8r c8() {
      return this.a6;
   }

   final t8r t2() {
      return this.u9;
   }

   final t8r s7() {
      return this.h0;
   }

   final t8r x8() {
      return this.c8;
   }

   final t8r n3() {
      return this.t2;
   }

   final t8r y4() {
      return this.s7;
   }

   final t8r e2() {
      return this.x8;
   }

   static <TEffectiveData extends r0> void n5(TEffectiveData var0) {
      var0.k5 = f6a.u9;
      var0.u3 = t8r.q0;
      var0.a6 = t8r.q0;
      var0.u9 = t8r.q0;
      var0.h0 = t8r.q0;
      var0.c8 = t8r.t4;
      var0.t2 = t8r.t4;
      var0.s7 = t8r.q0;
      var0.x8 = t8r.q0;
   }

   final void n5(i7b var1) {
      r0 var2 = (r0)var1;
      this.k5.n5((i7b)var2.k5);
      this.u3.n5((i7b)var2.u3);
      this.a6.n5((i7b)var2.a6);
      this.u9.n5((i7b)var2.u9);
      this.h0.n5((i7b)var2.h0);
      this.c8.n5((i7b)var2.c8);
      this.t2.n5((i7b)var2.t2);
      this.s7.n5((i7b)var2.s7);
      this.x8.n5((i7b)var2.x8);
   }

   static boolean n5(q1v var0, x6q var1) {
      return l6(var0, var1.t2());
   }

   final boolean n5(x6q var1) {
      return n5((q1v)this.W_(), this.k5, var1.t2());
   }

   final boolean l6(x6q var1) {
      boolean var2 = false;
      var2 |= this.n5(this.u3, var1.n5());
      var2 |= this.n5(this.a6, var1.k5());
      var2 |= this.n5(this.u9, var1.l6());
      var2 |= this.n5(this.h0, var1.u3());
      var2 |= this.n5(this.c8, var1.h0());
      var2 |= this.n5(this.t2, var1.c8());
      var2 |= this.n5(this.s7, var1.a6());
      return var2 | this.n5(this.x8, var1.u9());
   }

   static boolean l6(q1v var0, x6q var1) {
      boolean var2 = false;
      var2 |= n5(var0, var1.n5());
      var2 |= n5(var0, var1.k5());
      var2 |= n5(var0, var1.l6());
      var2 |= n5(var0, var1.u3());
      var2 |= n5(var0, var1.h0());
      var2 |= n5(var0, var1.c8());
      var2 |= n5(var0, var1.a6());
      return var2 | n5(var0, var1.u9());
   }

   static boolean n5(q1v var0, w0j var1) {
      if (var1 != null) {
         f6a var2 = var1.n5(n5(var0));
         if (var2 != null && var2.getFillType() != 0) {
            return true;
         }
      }

      return false;
   }

   static boolean l6(q1v var0, w0j var1) {
      if (var1 != null) {
         f6a var2 = var1.n5(n5(var0));
         if (var2 != null && var2.getFillType() != 0) {
            return true;
         }
      }

      return false;
   }

   static boolean n5(q1v var0, f6a var1, w0j var2) {
      if (var2 != null) {
         f6a var3 = var2.n5(n5(var0));
         if (var3 != null && var3.getFillType() != 0) {
            var1.n5((i7b)var3);
            if (var2.u3() == 2) {
               switch (var1.getFillType()) {
                  case 1:
                     var1.t2().n5((ColorFormat)var2.k5());
                  case 2:
                  case 3:
               }
            }

            return true;
         }
      }

      return false;
   }

   static boolean n5(q1v var0, v9r var1) {
      if (var1 != null) {
         t8r var2 = var1.n5(n5(var0));
         if (var2 != null) {
            return true;
         }
      }

      return false;
   }

   final boolean n5(t8r var1, v9r var2) {
      if (var2 != null) {
         t8r var3 = var2.n5(this.X_());
         if (var3 != null) {
            var1.n5((i7b)var3);
            if (var2.n5() == 2) {
               switch (var1.getFillFormat().getFillType()) {
                  case 1:
                     ((z1a)var1.getFillFormat()).a6().n5((ColorFormat)var2.k5());
                  case 2:
                  case 3:
               }
            }

            return true;
         }
      }

      return false;
   }

   @Override
   void n5(IBaseSlide var1, w6a var2) {
      this.k5.n5(var1, var2);
      this.u3.n5(var1, var2);
      this.a6.n5(var1, var2);
      this.u9.n5(var1, var2);
      this.h0.n5(var1, var2);
      this.c8.n5(var1, var2);
      this.t2.n5(var1, var2);
      this.s7.n5(var1, var2);
      this.x8.n5(var1, var2);
   }

   boolean l6(TEffectiveData var1) {
      return var1 == null
         ? false
         : this.k5.k5(var1.k5)
            && this.u3.n5(var1.u3)
            && this.a6.n5(var1.a6)
            && this.u9.n5(var1.u9)
            && this.h0.n5(var1.h0)
            && this.c8.n5(var1.c8)
            && this.t2.n5(var1.t2)
            && this.s7.n5(var1.s7)
            && this.x8.n5(var1.x8);
   }

   // $VF: synthetic method
   @Override

   boolean n5(g8 recoveredArg) {
      return this.l6((TEffectiveData)recoveredArg);
   }


}
