package com.aspose.slides.internal.f7v;

final class c8 implements u3 {
   // $VF: synthetic field
   final String n5;
   // $VF: synthetic field
   final String l6;

   c8(String var1, String var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   public boolean n5(s7 var1) {
      if (!var1.n5.equals(this.n5)) {
         return false;
      } else {
         return var1 instanceof e9 && !((e9)var1).u9().equals(this.l6) ? false : !(var1 instanceof v0) || ((v0)var1).k5().equals(this.l6);
      }
   }
}
