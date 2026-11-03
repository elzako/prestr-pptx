package com.aspose.slides.internal.g8v;

class a0 extends j9 {
   // $VF: synthetic field
   final w1 n5;

   a0(w1 var1) {
      this.n5 = var1;
   }

   @Override
   public boolean n5(z6 var1) {
      if (w1.t2(this.n5) != null) {
         if (w1.s7(this.n5).l6() != 1 && w1.x8(this.n5).l6() != 1) {
            w1.c8(this.n5).write(w1.t2(this.n5), 0, w1.n3(this.n5));
            w1.n5(this.n5, (byte[])null);
            w1.c8(this.n5).close();
         }
      } else if (!"HEAD".equals(w1.y4(this.n5))
         && !"GET".equals(w1.y4(this.n5))
         && !"MKCOL".equals(w1.y4(this.n5))
         && !"CONNECT".equals(w1.y4(this.n5))
         && !"TRACE".equals(w1.y4(this.n5))
         && w1.e2(this.n5)
         && !w1.c8(this.n5).t2()) {
         return w1.c8(this.n5).n5(var1);
      }

      return false;
   }
}
