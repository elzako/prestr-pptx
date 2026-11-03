package com.aspose.slides.ms.System.Xml;

class b6$u3 extends com.aspose.slides.internal.v6g.h0<b6$u3> {
   public String n5;
   public String l6;
   public int k5;
   public int u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("space", "lang");

   public b6$u3() {
   }

   public final void n5(String var1, String var2, int var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = -1;
   }

   public final void n5(l1 var1, v9 var2) {
      if (null != var2) {
         var2.l6(this.n5, this.l6);
      } else {
         if (this.n5.length() == 0) {
            var1.u3(com.aspose.slides.ms.System.d1.n5, "xmlns", "http://www.w3.org/2000/xmlns/");
         } else {
            var1.u3("xmlns", this.n5, "http://www.w3.org/2000/xmlns/");
         }

         var1.l6(this.l6);
         var1.l6();
      }
   }

   public void n5(b6$u3 var1) {
      var1 = var1 == null ? new b6$u3() : var1;
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
   }

   public b6$u3 n5() {
      b6$u3 var1 = new b6$u3();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(b6$u3 var1) {
      return com.aspose.slides.ms.System.j8.n5(var1.n5, this.n5)
         && com.aspose.slides.ms.System.j8.n5(var1.l6, this.l6)
         && var1.k5 == this.k5
         && var1.u3 == this.u3;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof b6$u3) ? false : this.l6((b6$u3)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public b6$u3 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(b6$u3 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
