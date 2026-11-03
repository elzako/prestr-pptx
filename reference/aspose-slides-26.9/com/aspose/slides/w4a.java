package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.ms.System.IDisposable;

class w4a extends g3c {
   private List<k6a> n5 = new List<>();

   @Override
   public String J_() {
      return this.s7().n5();
   }

   public final List<k6a> k5() {
      return this.n5;
   }

   public final String u3() {
      return this.s7().l6();
   }

   public final String a6() {
      return this.s7().u3();
   }

   public final int u9() {
      return this.s7().k5();
   }

   public w4a(v8v var1, com.aspose.slides.internal.k4y.y5g var2) {
   }

   @Override
   public void n5(k6a var1, l6s var2) {
      k6a var3 = new k6a(var1, this.n5(var2), this, var2);
      d5 var4 = this.n5(d5.class, var2, var3);
      if (var4 != null) {
         boolean var5 = var4.l6() && var2.e2() == 6 && var2.u9();
         if (var5) {
            e5g var6 = this.n5(e5g.class);
            if (var6 != null) {
               z5z var7 = var6.k5();
               if (var7.u9().size() > 0 && !var7.u9().get_Item(var7.u9().size() - 1) || var7.n5().size() > 0 && var7.n5().get_Item(var7.n5().size() - 1) == 12) {
                  var5 = false;
               }
            }
         }

         if (!var5) {
            if (var1 != null) {
               var1.l6().addItem(var3);
            }

            var4.h0().addItem(var3);
            var3.n5(var4);
            f2f var19 = this.n5(f2f.class, var2, var3);
            if (var19 != null && (var19.k5() != -1 || var19.u3())) {
               var3.c8().n5(this.z1().l6(), var19);
               y1z var20 = this.n5(y1z.class, var2, var3);
               List var8 = null;
               if (var20 != null) {
                  var8 = var2.n5(var20.k5(), var4.l6());
               } else if (com.aspose.slides.internal.v6g.k5.l6(var4, h3o.class)) {
                  com.aspose.slides.internal.k4y.d4w var9 = new com.aspose.slides.internal.k4y.d4w();
                  var9.n5("self");
                  var8 = var2.n5(new z5z(var9), var4.l6());
               }

               if (var8 != null) {
                  List$Enumerator var23 = var8.iterator();

                  try {
                     while (var23.hasNext()) {
                        l6s var10 = (l6s)var23.next();
                        var3.u9().addItem(var10);
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var23, IDisposable.class)) {
                        var23.dispose();
                     }
                  }
               }
            }

            IGenericEnumerator var21 = this.t9().iterator();

            try {
               while (var21.hasNext()) {
                  g3c var22 = (g3c)var21.next();
                  var22.n5(var3, var2);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var21, IDisposable.class)) {
                  var21.dispose();
               }
            }
         }
      }
   }

   public final w4c n5(l6s var1) {
      w4c var2 = this.z1().l6().n5(var1.t9(), this.J_());
      if (var2 == null) {
         t5w var3 = new t5w(this.z1().l6().getPresentation(), InterruptionToken.getNone());
         com.aspose.slides.internal.k4y.h6q var4 = new com.aspose.slides.internal.k4y.h6q();
         var4.n5();
         var4.l6();
         var4.k5();
         var2 = new w4c(var4, this.z1().l6(), var3);
         var2.l6(com.aspose.slides.ms.System.d1.n5(new String[]{"{", com.aspose.slides.ms.System.d1.t2(com.aspose.slides.ms.System.o0.l6().toString()), "}"}));
         var2.n5(4);
         var2.k5().l6(this.J_());
         var2.k5().k5(this.s7().l6());
      }

      var2.k5().n5(var1.t9());
      return var2;
   }

   public final void c8() {
      Stack var1 = new Stack();
      var1.push(this);
      n5(this, var1);

      while (var1.size() != 0) {
         w4a var2 = (w4a)var1.pop();
         List$Enumerator var3 = var2.k5().iterator();

         try {
            while (var3.hasNext()) {
               k6a var4 = (k6a)var3.next();
               var4.y2();
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }
      }
   }

   public final String n5(int var1, k6a var2) {
      String var3 = b4f.n5(var2.y4().k5().k7(), var1);
      if (var3 != null) {
         return var3;
      }

      for (k6a var4 = var2.n5(); var4 != null; var4 = var4.n5()) {
         var3 = b4f.n5(var4.y4().k5().k7(), var1);
         if (var3 != null) {
            return var3;
         }
      }

      return this.n5(var1);
   }

   public final List<w4a> t2() {
      List var1 = new List();
      n5(this, var1);
      return var1;
   }

   @Override
   protected void L_() {
      List$Enumerator var1 = this.n5.iterator();

      try {
         while (var1.hasNext()) {
            k6a var2 = (k6a)var1.next();
            if (!com.aspose.slides.ms.System.d1.n5(this.a6())) {
               k6a var3 = var2.u3();
               if (var3 == null && var2.n5() != null) {
                  var3 = var2.n5().l6().get_Item(0);
               }

               while (var3 != null && var3 != var2) {
                  if (com.aspose.slides.ms.System.d1.a6(var3.h0().J_(), this.a6())) {
                     var2.n5(var3.j5().u9());
                     var3.c8().l6(var2.c8());
                     break;
                  }

                  var3 = var3.u3();
                  if (var3 == null && var2.n5() != null) {
                     var3 = var2.n5().l6().get_Item(0);
                  }
               }
            }

            if (var2.u9().size() > 0) {
               List var14 = new List();
               n5(var2.t2(), var2.u9().get_Item(0).t9(), var14);
               List$Enumerator var4 = var14.iterator();

               try {
                  while (var4.hasNext()) {
                     k6a var5 = (k6a)var4.next();
                     if (var5 != var2 && !var2.c8().n5(var5.c8()) && var2.c8().s3() != var5.c8()) {
                        var5.n5(var2.j5().u9());
                        var2.c8().l6(var5.c8());
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
                     var4.dispose();
                  }
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }
   }

   private String n5(int var1) {
      if (var1 == 0) {
         return null;
      }

      for (g3c var2 = this; var2 != null; var2 = var2.e2()) {
         w4a var3 = com.aspose.slides.internal.v6g.k5.n5(var2, w4a.class);
         if (var3 != null) {
            b4f var4 = null;
            IGenericEnumerator var5 = var3.t9().iterator();

            try {
               while (var5.hasNext()) {
                  g3c var6 = (g3c)var5.next();
                  var4 = com.aspose.slides.internal.v6g.k5.n5(var6, b4f.class);
                  if (var4 != null) {
                     break;
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
                  var5.dispose();
               }
            }

            if (var4 != null) {
               String var10 = var4.n5(var1);
               if (var10 != null) {
                  return var10;
               }
            }
         }
      }

      return null;
   }

   private static void n5(g3c var0, Stack<w4a> var1) {
      IGenericEnumerator var2 = var0.t9().iterator();

      try {
         while (var2.hasNext()) {
            g3c var3 = (g3c)var2.next();
            w4a var4 = com.aspose.slides.internal.v6g.k5.n5(var3, w4a.class);
            if (var4 != null) {
               var1.push(var4);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      IGenericEnumerator var13 = var0.t9().iterator();

      try {
         while (var13.hasNext()) {
            g3c var14 = (g3c)var13.next();
            n5(var14, var1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var13, IDisposable.class)) {
            var13.dispose();
         }
      }
   }

   private static void n5(g3c var0, List<w4a> var1) {
      IGenericEnumerator var2 = var0.t9().iterator();

      try {
         while (var2.hasNext()) {
            g3c var3 = (g3c)var2.next();
            w4a var4 = com.aspose.slides.internal.v6g.k5.n5(var3, w4a.class);
            if (var4 != null) {
               var1.addItem(var4);
            }

            n5(var3, var1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   private static void n5(k6a var0, String var1, List<k6a> var2) {
      if (var0.u9().size() > 0
         && com.aspose.slides.ms.System.d1.a6(var0.u9().get_Item(0).t9(), var1)
         && var0.c8().t4()
         && com.aspose.slides.internal.v6g.k5.l6(var0.s7(), h3o.class)) {
         var2.addItem(var0);
      }

      List$Enumerator var3 = var0.l6().iterator();

      try {
         while (var3.hasNext()) {
            k6a var4 = (k6a)var3.next();
            n5(var4, var1, var2);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   private com.aspose.slides.internal.k4y.y5g s7() {
      return (com.aspose.slides.internal.k4y.y5g)this.q0();
   }
}
