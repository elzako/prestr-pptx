package com.aspose.slides.internal.b8c;

import com.aspose.slides.exceptions.ArgumentNullException;

public class p1 extends m9 {
   public static final e3m n5 = new p1(1);
   public static final e3m l6 = new p1(10);

   protected p1(int var1) {
      super(var1);
   }

   @Override
   public boolean n5(Object var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      com.aspose.slides.ms.System.y8 var2 = com.aspose.slides.ms.System.j8.n5(var1);
      return var2 == y4 ? ((x6)var1).a6() : com.aspose.slides.internal.v6g.k5.u3(this.k5(var1, r4, null), boolean.class);
   }

   @Override
   public com.aspose.slides.ms.System.j5 l6(Object var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      com.aspose.slides.ms.System.y8 var2 = com.aspose.slides.ms.System.j8.n5(var1);
      return var2 == y4 ? ((x6)var1).u9() : com.aspose.slides.internal.v6g.k5.u3(this.k5(var1, j5, null), com.aspose.slides.ms.System.j5.class);
   }

   @Override
   public com.aspose.slides.ms.System.w1 k5(Object var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      com.aspose.slides.ms.System.y8 var2 = com.aspose.slides.ms.System.j8.n5(var1);
      return var2 == y4
         ? com.aspose.slides.internal.v6g.k5.u3(((x6)var1).n5(w1), com.aspose.slides.ms.System.w1.class)
         : com.aspose.slides.internal.v6g.k5.u3(this.k5(var1, w1, null), com.aspose.slides.ms.System.w1.class);
   }

   @Override
   public com.aspose.slides.ms.System.c4 u3(Object var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      com.aspose.slides.ms.System.y8 var2 = com.aspose.slides.ms.System.j8.n5(var1);
      return var2 == y4
         ? com.aspose.slides.internal.v6g.k5.u3(((x6)var1).n5(t2), com.aspose.slides.ms.System.c4.class)
         : com.aspose.slides.internal.v6g.k5.u3(this.k5(var1, t2, null), com.aspose.slides.ms.System.c4.class);
   }

   @Override
   public double a6(Object var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      com.aspose.slides.ms.System.y8 var2 = com.aspose.slides.ms.System.j8.n5(var1);
      return var2 == y4 ? ((x6)var1).h0() : com.aspose.slides.internal.v6g.k5.u3(this.k5(var1, m3, null), double.class);
   }

   @Override
   public int u9(Object var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      com.aspose.slides.ms.System.y8 var2 = com.aspose.slides.ms.System.j8.n5(var1);
      return var2 == y4 ? ((x6)var1).t2() : com.aspose.slides.internal.v6g.k5.u3(this.k5(var1, s7, null), int.class);
   }

   @Override
   public long h0(Object var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      com.aspose.slides.ms.System.y8 var2 = com.aspose.slides.ms.System.j8.n5(var1);
      return var2 == y4 ? ((x6)var1).s7() : com.aspose.slides.internal.v6g.k5.u3(this.k5(var1, x8, null), long.class);
   }

   @Override
   public float c8(Object var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      com.aspose.slides.ms.System.y8 var2 = com.aspose.slides.ms.System.j8.n5(var1);
      return var2 == y4
         ? com.aspose.slides.internal.v6g.k5.u3(((x6)var1).n5(z8), float.class)
         : com.aspose.slides.internal.v6g.k5.u3(this.k5(var1, z8, null), float.class);
   }

   @Override
   public Object n5(Boolean var1, com.aspose.slides.ms.System.y8 var2) {
      if (var2 == null) {
         throw new ArgumentNullException("destinationType");
      }

      if (var2 == e2) {
         var2 = this.u3();
      }

      return var2 == y4 ? new x6(j9e.k5(13), var1.booleanValue()) : this.u3(var1, var2, null);
   }

   @Override
   public Object n5(com.aspose.slides.ms.System.j5 var1, com.aspose.slides.ms.System.y8 var2) {
      if (var2 == null) {
         throw new ArgumentNullException("destinationType");
      }

      if (var2 == e2) {
         var2 = this.u3();
      }

      return var2 == y4 ? new x6(j9e.k5(18), var1.m3()) : this.u3(var1.m3(), var2, null);
   }

   @Override
   public Object n5(com.aspose.slides.ms.System.c4 var1, com.aspose.slides.ms.System.y8 var2) {
      if (var2 == null) {
         throw new ArgumentNullException("destinationType");
      }

      if (var2 == e2) {
         var2 = this.u3();
      }

      return var2 == y4 ? new x6(j9e.k5(14), var1.l6()) : this.u3(var1.l6(), var2, null);
   }

   @Override
   public Object n5(Double var1, com.aspose.slides.ms.System.y8 var2) {
      if (var2 == null) {
         throw new ArgumentNullException("destinationType");
      }

      if (var2 == e2) {
         var2 = this.u3();
      }

      return var2 == y4 ? new x6(j9e.k5(16), var1.doubleValue()) : this.u3(var1, var2, null);
   }

   @Override
   public Object n5(Integer var1, com.aspose.slides.ms.System.y8 var2) {
      if (var2 == null) {
         throw new ArgumentNullException("destinationType");
      }

      if (var2 == e2) {
         var2 = this.u3();
      }

      return var2 == y4 ? new x6(j9e.k5(44), var1.intValue()) : this.u3(var1, var2, null);
   }

   @Override
   public Object n5(Long var1, com.aspose.slides.ms.System.y8 var2) {
      if (var2 == null) {
         throw new ArgumentNullException("destinationType");
      }

      if (var2 == e2) {
         var2 = this.u3();
      }

      return var2 == y4 ? new x6(j9e.k5(43), var1.longValue()) : this.u3(var1, var2, null);
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

      return var2 == y4 ? new x6(j9e.k5(12), var1) : this.u3(var1, var2, var3);
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

      if (var2 == r4 && var4 == y4) {
         return ((x6)var1).a6();
      }

      if (var2 == j5 && var4 == y4) {
         return ((x6)var1).u9();
      }

      if (var2 == w1 && var4 == y4) {
         return ((x6)var1).n5(w1);
      }

      if (var2 == t2 && var4 == y4) {
         return com.aspose.slides.internal.v6g.k5.u3(((x6)var1).n5(t2), com.aspose.slides.ms.System.c4.class);
      }

      if (var2 == m3 && var4 == y4) {
         return ((x6)var1).h0();
      }

      if (var2 == s7 && var4 == y4) {
         return ((x6)var1).t2();
      }

      if (var2 == x8 && var4 == y4) {
         return ((x6)var1).s7();
      }

      if (var2 == z8 && var4 == y4) {
         return com.aspose.slides.internal.v6g.k5.u3(((x6)var1).n5(z8), float.class);
      }

      if (var2 == y4) {
         if (var4 == y4) {
            return (x6)var1;
         }

         if (var4 == r4) {
            return new x6(j9e.k5(13), com.aspose.slides.internal.v6g.k5.u3(var1, boolean.class));
         }

         if (var4 == t9) {
            return new x6(j9e.k5(51), var1);
         }

         if (var4 == c4) {
            return new x6(j9e.k5(27), var1);
         }

         if (var4 == j5) {
            return new x6(j9e.k5(18), com.aspose.slides.internal.v6g.k5.u3(var1, com.aspose.slides.ms.System.j5.class).m3());
         }

         if (var4 == w1) {
            return new x6(j9e.k5(18), ((com.aspose.slides.ms.System.w1)var1).a6());
         }

         if (var4 == t2) {
            return new x6(j9e.k5(14), var1);
         }

         if (var4 == m3) {
            return new x6(j9e.k5(16), com.aspose.slides.internal.v6g.k5.u3(var1, double.class));
         }

         if (var4 == z1) {
            return new x6(j9e.k5(45), var1);
         }

         if (var4 == s7) {
            return new x6(j9e.k5(44), com.aspose.slides.internal.v6g.k5.u3(var1, int.class));
         }

         if (var4 == x8) {
            return new x6(j9e.k5(43), com.aspose.slides.internal.v6g.k5.u3(var1, long.class));
         }

         if (var4 == t4) {
            return new x6(j9e.k5(46), var1);
         }

         if (var4 == z8) {
            return new x6(j9e.k5(15), var1);
         }

         if (var4 == n3) {
            return new x6(j9e.k5(12), (String)var1);
         }

         if (var4 == a0) {
            return new x6(j9e.k5(17), var1);
         }

         if (var4 == q0) {
            return new x6(j9e.k5(50), var1);
         }

         if (var4 == z3) {
            return new x6(j9e.k5(49), var1);
         }

         if (var4 == m1) {
            return new x6(j9e.k5(48), var1);
         }

         if (n5(var4, y1)) {
            return new x6(j9e.k5(28), var1);
         }

         if (n5(var4, y2)) {
            return new x6(j9e.k5(29), var1, var3);
         }
      }

      if (var2 == k7) {
         if (var4 == y4) {
            return (x6)var1;
         }

         if (n5(var4, d2)) {
            return (com.aspose.slides.internal.x6s.a6)var1;
         }
      }

      if (var2 == d2 && n5(var4, d2)) {
         return this.n5((com.aspose.slides.internal.x6s.a6)var1);
      } else if (var2 == k7) {
         return (com.aspose.slides.internal.x6s.u3)this.n5(var1, y4, var3);
      } else {
         return var4 == y4 ? ((x6)var1).n5(var2, var3) : this.l6(var1, var2, var3);
      }
   }

   private Object k5(Object var1, com.aspose.slides.ms.System.y8 var2, com.aspose.slides.ms.System.Xml.a3 var3) {
      com.aspose.slides.ms.System.y8 var4 = com.aspose.slides.ms.System.j8.n5(var1);
      return var4 == y4 ? ((x6)var1).n5(var2, var3) : this.l6(var1, var2, var3);
   }

   private Object u3(Object var1, com.aspose.slides.ms.System.y8 var2, com.aspose.slides.ms.System.Xml.a3 var3) {
      return var2 == k7 ? (com.aspose.slides.internal.x6s.u3)this.n5(var1, y4, var3) : this.l6(var1, var2, var3);
   }

   private com.aspose.slides.internal.x6s.a6 n5(com.aspose.slides.internal.x6s.a6 var1) {
      if (this.l6() != 1) {
         throw this.l6(d2, d2);
      } else {
         return var1;
      }
   }
}
