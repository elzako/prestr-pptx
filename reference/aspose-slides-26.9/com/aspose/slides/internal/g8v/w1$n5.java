package com.aspose.slides.internal.g8v;

class w1$n5 extends com.aspose.slides.internal.v6g.h0<w1$n5> {
   w1 n5;
   boolean l6;
   private boolean u3;
   private int a6;
   // $VF: synthetic field
   static final boolean k5 = !w1.class.desiredAssertionStatus();

   public w1$n5() {
   }

   public boolean n5() {
      return this.u3;
   }

   public int l6() {
      return this.a6;
   }

   public boolean k5() {
      return this.u3 && this.a6 != 0;
   }

   public w1$n5(w1 var1, boolean var2) {
      this.n5 = var1;
      this.l6 = var2;
      this.u3 = false;
      this.a6 = 0;
   }

   public boolean n5(u8 var1, int var2) {
      this.u3 = false;
      if (var2 == 401 && w1.t9(this.n5) == null) {
         return false;
      }

      if (this.l6 != (var2 == 407)) {
         return false;
      }

      if (!this.l6 || w1.z1(this.n5) != null && w1.z1(this.n5).n5() != null) {
         String[] var3 = var1.n5().n5(this.l6 ? "Proxy-Authenticate" : "WWW-Authenticate", false);
         if (var3 != null && var3.length != 0) {
            f2 var4 = !this.l6 ? w1.t9(this.n5) : w1.z1(this.n5).n5();
            l6 var5 = null;

            for (String var9 : var3) {
               var5 = com.aspose.slides.internal.g8v.n5.n5(var9, this.n5, var4);
               if (var5 != null) {
                  break;
               }
            }

            if (var5 == null) {
               return false;
            }

            w1.t4(this.n5).set_Item(this.l6 ? "Proxy-Authorization" : "Authorization", var5.n5());
            this.u3 = var5.l6();
            boolean var10 = "NTLM".equals(var5.k5().n5());
            if (var10) {
               this.a6++;
            }

            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public void u3() {
      this.u3 = false;
      this.a6 = 0;
      w1.t4(this.n5).k5(this.l6 ? "Proxy-Authorization" : "Authorization");
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5(
         "{0}AuthState [{1}:{2}]", this.l6 ? "Proxy" : "", com.aspose.slides.internal.v6g.k5.n5(this.u3), com.aspose.slides.internal.v6g.k5.l6(this.a6)
      );
   }

   public void n5(w1$n5 var1) {
      var1 = var1 == null ? new w1$n5() : var1;
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.u3 = this.u3;
      var1.a6 = this.a6;
   }

   public w1$n5 a6() {
      w1$n5 var1 = new w1$n5();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.a6();
   }

   private boolean l6(w1$n5 var1) {
      return com.aspose.slides.ms.System.j8.n5(var1.n5, this.n5) && var1.l6 == this.l6 && var1.u3 == this.u3 && var1.a6 == this.a6;
   }

   @Override
   public boolean equals(Object obj) {
      assert obj != null;
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof w1$n5) ? false : this.l6((w1$n5)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public w1$n5 Clone() {
      return this.a6();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(w1$n5 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
