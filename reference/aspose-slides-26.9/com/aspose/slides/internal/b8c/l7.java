package com.aspose.slides.internal.b8c;

import com.aspose.slides.exceptions.ArgumentNullException;

public class l7 extends m9 {
   protected l7(j9e var1) {
      super(var1);
   }

   public static e3m n5(j9e var0) {
      return new l7(var0);
   }

   @Override
   public com.aspose.slides.ms.System.j5 n5(com.aspose.slides.ms.System.w1 var1) {
      return x8(var1.a6());
   }

   @Override
   public com.aspose.slides.ms.System.j5 n5(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      switch (this.l6()) {
         case 19:
            return r4(var1);
         case 20:
            return t2(var1);
         case 21:
            return t4(var1);
         case 22:
            return z1(var1);
         case 23:
            return t9(var1);
         case 24:
            return y4(var1);
         case 25:
            return e2(var1);
         default:
            return s7(var1);
      }
   }

   @Override
   public com.aspose.slides.ms.System.j5 l6(Object var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      } else {
         com.aspose.slides.ms.System.y8 var2 = com.aspose.slides.ms.System.j8.n5(var1);
         if (var2 == j5) {
            return com.aspose.slides.internal.v6g.k5.u3(var1, com.aspose.slides.ms.System.j5.class);
         } else if (var2 == w1) {
            return this.n5(com.aspose.slides.internal.v6g.k5.u3(var1, com.aspose.slides.ms.System.w1.class).a6());
         } else if (var2 == n3) {
            return this.n5((String)var1);
         } else {
            return var2 == y4 ? ((x6)var1).u9() : com.aspose.slides.internal.v6g.k5.u3(this.l6(var1, j5, null), com.aspose.slides.ms.System.j5.class);
         }
      }
   }

   @Override
   public com.aspose.slides.ms.System.w1 l6(com.aspose.slides.ms.System.j5 var1) {
      return new com.aspose.slides.ms.System.w1(var1.m3());
   }

   @Override
   public com.aspose.slides.ms.System.w1 l6(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      switch (this.l6()) {
         case 19:
            return c4(var1);
         case 20:
            return q0(var1);
         case 21:
            return j5(var1);
         case 22:
            return z8(var1);
         case 23:
            return m3(var1);
         case 24:
            return m1(var1);
         case 25:
            return k7(var1);
         default:
            return z3(var1);
      }
   }

   @Override
   public com.aspose.slides.ms.System.w1 k5(Object var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      } else {
         com.aspose.slides.ms.System.y8 var2 = com.aspose.slides.ms.System.j8.n5(var1);
         if (var2 == j5) {
            return this.l6(com.aspose.slides.internal.v6g.k5.u3(var1, com.aspose.slides.ms.System.j5.class).m3());
         } else if (var2 == w1) {
            return com.aspose.slides.internal.v6g.k5.u3(var1, com.aspose.slides.ms.System.w1.class);
         } else if (var2 == n3) {
            return this.l6((String)var1);
         } else {
            return var2 == y4
               ? com.aspose.slides.ms.System.w1.n5(((x6)var1).u9())
               : com.aspose.slides.internal.v6g.k5.u3(this.l6(var1, w1, null), com.aspose.slides.ms.System.w1.class);
         }
      }
   }

   @Override
   public String u9(com.aspose.slides.ms.System.j5 var1) {
      switch (this.l6()) {
         case 19:
            return e2(var1.m3());
         case 20:
            return h0(var1.m3());
         case 21:
            return y4(var1.m3());
         case 22:
            return n3(var1.m3());
         case 23:
            return x8(var1.m3());
         case 24:
            return t2(var1.m3());
         case 25:
            return s7(var1.m3());
         default:
            return c8(var1.m3());
      }
   }

   @Override
   public String l6(com.aspose.slides.ms.System.w1 var1) {
      switch (this.l6()) {
         case 19:
            return s7(var1.a6());
         case 20:
            return k5(var1.a6());
         case 21:
            return t2(var1.a6());
         case 22:
            return c8(var1.a6());
         case 23:
            return h0(var1.a6());
         case 24:
            return a6(var1.a6());
         case 25:
            return u9(var1.a6());
         default:
            return u3(var1.a6());
      }
   }

   @Override
   public String n5(Object var1, com.aspose.slides.ms.System.Xml.a3 var2) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      } else {
         com.aspose.slides.ms.System.y8 var3 = com.aspose.slides.ms.System.j8.n5(var1);
         if (var3 == j5) {
            return this.u9(com.aspose.slides.internal.v6g.k5.u3(var1, com.aspose.slides.ms.System.j5.class).m3());
         } else if (var3 == w1) {
            return this.l6(com.aspose.slides.internal.v6g.k5.u3(var1, com.aspose.slides.ms.System.w1.class).a6());
         } else if (var3 == n3) {
            return (String)var1;
         } else {
            return var3 == y4 ? ((x6)var1).c8() : (String)this.l6(var1, n3, var2);
         }
      }
   }

   @Override
   public Object n5(com.aspose.slides.ms.System.j5 var1, com.aspose.slides.ms.System.y8 var2) {
      if (var2 == null) {
         throw new ArgumentNullException("destinationType");
      }

      if (var2 == e2) {
         var2 = this.u3();
      }

      if (var2 == j5) {
         return var1;
      } else if (var2 == w1) {
         return this.l6(var1.m3());
      } else if (var2 == n3) {
         return this.u9(var1.m3());
      } else if (var2 == y4) {
         return new x6(this.n5(), var1.m3());
      } else {
         return var2 == k7 ? new x6(this.n5(), var1.m3()) : this.l6(var1.m3(), var2, null);
      }
   }

   @Override
   public Object n5(String var1, com.aspose.slides.ms.System.y8 var2, com.aspose.slides.ms.System.Xml.a3 var3) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      if (var2 == null) {
         throw new ArgumentNullException("destinationType");
      }

      if (var2 == e2) {
         var2 = this.u3();
      }

      if (var2 == j5) {
         return this.n5(var1);
      } else if (var2 == w1) {
         return this.l6(var1);
      } else if (var2 == n3) {
         return var1;
      } else if (var2 == y4) {
         return new x6(this.n5(), var1);
      } else {
         return var2 == k7 ? new x6(this.n5(), var1) : this.l6(var1, var2, var3);
      }
   }

   @Override
   public Object n5(Object var1, com.aspose.slides.ms.System.y8 var2, com.aspose.slides.ms.System.Xml.a3 var3) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      if (var2 == null) {
         throw new ArgumentNullException("destinationType");
      }

      com.aspose.slides.ms.System.y8 var4 = com.aspose.slides.ms.System.j8.n5(var1);
      if (var2 == e2) {
         var2 = this.u3();
      }

      if (var2 == j5) {
         return this.l6(var1);
      }

      if (var2 == w1) {
         return this.k5(var1);
      }

      if (var2 == n3) {
         return this.n5(var1, var3);
      }

      if (var2 == y4) {
         if (var4 == j5) {
            return new x6(this.n5(), com.aspose.slides.internal.v6g.k5.u3(var1, com.aspose.slides.ms.System.j5.class).m3());
         }

         if (var4 == w1) {
            return new x6(this.n5(), ((com.aspose.slides.ms.System.w1)var1).a6());
         }

         if (var4 == n3) {
            return new x6(this.n5(), (String)var1);
         }

         if (var4 == y4) {
            return (x6)var1;
         }
      }

      if (var2 == k7) {
         if (var4 == j5) {
            return new x6(this.n5(), com.aspose.slides.internal.v6g.k5.u3(var1, com.aspose.slides.ms.System.j5.class).m3());
         }

         if (var4 == w1) {
            return new x6(this.n5(), ((com.aspose.slides.ms.System.w1)var1).a6());
         }

         if (var4 == n3) {
            return new x6(this.n5(), (String)var1);
         }

         if (var4 == y4) {
            return (x6)var1;
         }
      }

      return this.l6(var1, var2, var3);
   }
}
