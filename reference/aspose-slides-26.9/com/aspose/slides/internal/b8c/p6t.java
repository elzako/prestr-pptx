package com.aspose.slides.internal.b8c;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidCastException;

public class p6t extends q5 {
   private boolean s3;
   public static final e3m n5 = new p6t(new p6t(), false);
   public static final e3m l6 = new p6t(new p6t(), true);

   protected p6t() {
      super(com.aspose.slides.internal.b8c.t4.l6());
   }

   protected p6t(p6t var1, boolean var2) {
      super(var1, var2 ? h0 : n3);
      this.s3 = var2;
   }

   @Override
   public boolean n5(Object var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      com.aspose.slides.ms.System.y8 var2 = com.aspose.slides.ms.System.j8.n5(var1);
      return var2 == n3 ? com.aspose.slides.ms.System.Xml.f4.t2((String)var1) : com.aspose.slides.internal.v6g.k5.u3(this.k5(var1, r4, null), boolean.class);
   }

   @Override
   public com.aspose.slides.ms.System.j5 n5(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      } else {
         return y1(var1);
      }
   }

   @Override
   public com.aspose.slides.ms.System.j5 l6(Object var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      com.aspose.slides.ms.System.y8 var2 = com.aspose.slides.ms.System.j8.n5(var1);
      return var2 == n3 ? y1((String)var1) : com.aspose.slides.internal.v6g.k5.u3(this.k5(var1, j5, null), com.aspose.slides.ms.System.j5.class);
   }

   @Override
   public com.aspose.slides.ms.System.w1 l6(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      } else {
         return a0(var1);
      }
   }

   @Override
   public com.aspose.slides.ms.System.w1 k5(Object var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      com.aspose.slides.ms.System.y8 var2 = com.aspose.slides.ms.System.j8.n5(var1);
      return var2 == n3 ? a0((String)var1) : com.aspose.slides.internal.v6g.k5.u3(this.k5(var1, w1, null), com.aspose.slides.ms.System.w1.class);
   }

   @Override
   public com.aspose.slides.ms.System.c4 k5(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      } else {
         return com.aspose.slides.ms.System.Xml.f4.x8(var1);
      }
   }

   @Override
   public com.aspose.slides.ms.System.c4 u3(Object var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      com.aspose.slides.ms.System.y8 var2 = com.aspose.slides.ms.System.j8.n5(var1);
      return var2 == n3
         ? com.aspose.slides.ms.System.Xml.f4.x8((String)var1)
         : com.aspose.slides.internal.v6g.k5.u3(this.k5(var1, t2, null), com.aspose.slides.ms.System.c4.class);
   }

   @Override
   public double u3(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      } else {
         return com.aspose.slides.ms.System.Xml.f4.k7(var1);
      }
   }

   @Override
   public double a6(Object var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      com.aspose.slides.ms.System.y8 var2 = com.aspose.slides.ms.System.j8.n5(var1);
      return var2 == n3 ? com.aspose.slides.ms.System.Xml.f4.k7((String)var1) : com.aspose.slides.internal.v6g.k5.u3(this.k5(var1, m3, null), double.class);
   }

   @Override
   public int a6(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      } else {
         return com.aspose.slides.ms.System.Xml.f4.e2(var1);
      }
   }

   @Override
   public int u9(Object var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      com.aspose.slides.ms.System.y8 var2 = com.aspose.slides.ms.System.j8.n5(var1);
      return var2 == n3 ? com.aspose.slides.ms.System.Xml.f4.e2((String)var1) : com.aspose.slides.internal.v6g.k5.u3(this.k5(var1, s7, null), int.class);
   }

   @Override
   public long u9(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      } else {
         return com.aspose.slides.ms.System.Xml.f4.t9(var1);
      }
   }

   @Override
   public long h0(Object var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      com.aspose.slides.ms.System.y8 var2 = com.aspose.slides.ms.System.j8.n5(var1);
      return var2 == n3 ? com.aspose.slides.ms.System.Xml.f4.t9((String)var1) : com.aspose.slides.internal.v6g.k5.u3(this.k5(var1, x8, null), long.class);
   }

   @Override
   public float h0(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      } else {
         return com.aspose.slides.ms.System.Xml.f4.m1(var1);
      }
   }

   @Override
   public float c8(Object var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      com.aspose.slides.ms.System.y8 var2 = com.aspose.slides.ms.System.j8.n5(var1);
      return var2 == n3 ? com.aspose.slides.ms.System.Xml.f4.m1((String)var1) : com.aspose.slides.internal.v6g.k5.u3(this.k5(var1, z8, null), float.class);
   }

   @Override
   public String a6(Boolean var1) {
      return com.aspose.slides.ms.System.Xml.f4.n5(var1.booleanValue());
   }

   @Override
   public String u9(com.aspose.slides.ms.System.j5 var1) {
      return c8(var1.m3());
   }

   @Override
   public String l6(com.aspose.slides.ms.System.w1 var1) {
      return u3(var1.a6());
   }

   @Override
   public String n5(com.aspose.slides.ms.System.c4 var1) {
      return com.aspose.slides.ms.System.Xml.f4.n5(var1.l6());
   }

   @Override
   public String u9(Double var1) {
      return com.aspose.slides.ms.System.Xml.f4.n5(var1.doubleValue());
   }

   @Override
   public String a6(Integer var1) {
      return com.aspose.slides.ms.System.Xml.f4.n5(var1.intValue());
   }

   @Override
   public String a6(Long var1) {
      return com.aspose.slides.ms.System.Xml.f4.n5(var1.longValue());
   }

   @Override
   public String n5(Float var1) {
      return com.aspose.slides.ms.System.Xml.f4.n5(var1.floatValue());
   }

   @Override
   public String n5(Object var1, com.aspose.slides.ms.System.Xml.a3 var2) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      } else {
         com.aspose.slides.ms.System.y8 var3 = com.aspose.slides.ms.System.j8.n5(var1);
         if (var3 == r4) {
            return com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(var1, boolean.class).booleanValue());
         } else if (var3 == t9) {
            return com.aspose.slides.ms.System.Xml.f4.l6(com.aspose.slides.internal.v6g.k5.u3(var1, byte.class).byteValue());
         } else if (var3 == c4) {
            return n5(com.aspose.slides.internal.v6g.k5.k5(var1, byte[].class));
         } else if (var3 == j5) {
            return c8(com.aspose.slides.internal.v6g.k5.u3(var1, com.aspose.slides.ms.System.j5.class).m3());
         } else if (var3 == w1) {
            return u3(com.aspose.slides.internal.v6g.k5.u3(var1, com.aspose.slides.ms.System.w1.class).a6());
         } else if (var3 == t2) {
            return com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(var1, com.aspose.slides.ms.System.c4.class).l6());
         } else if (var3 == m3) {
            return com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(var1, double.class).doubleValue());
         } else if (var3 == z1) {
            return com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(var1, short.class).shortValue());
         } else if (var3 == s7) {
            return com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(var1, int.class).intValue());
         } else if (var3 == x8) {
            return com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(var1, long.class).longValue());
         } else if (var3 == t4) {
            return com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(var1, byte.class).byteValue());
         } else if (var3 == z8) {
            return com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(var1, float.class).floatValue());
         } else if (var3 == n3) {
            return (String)var1;
         } else if (var3 == a0) {
            return l6(com.aspose.slides.internal.v6g.k5.u3(var1, com.aspose.slides.ms.System.s4.class).n3());
         } else if (var3 == q0) {
            return com.aspose.slides.ms.System.Xml.f4.l6(com.aspose.slides.internal.v6g.k5.u3(var1, int.class).intValue());
         } else if (var3 == z3) {
            return com.aspose.slides.ms.System.Xml.f4.l6(com.aspose.slides.internal.v6g.k5.u3(var1, long.class).longValue());
         } else if (var3 == m1) {
            return com.aspose.slides.ms.System.Xml.f4.k5(com.aspose.slides.internal.v6g.k5.u3(var1, long.class));
         } else if (n5(var3, y1)) {
            return n5((com.aspose.slides.ms.System.r8)var1);
         } else if (var3 == y4) {
            return (String)((x6)var1).n5(n3, var2);
         } else {
            return n5(var3, y2) ? n5((com.aspose.slides.ms.System.Xml.k6)var1, var2) : (String)this.k5(var1, n3, var2);
         }
      }
   }

   @Override
   public Object n5(Boolean var1, com.aspose.slides.ms.System.y8 var2) {
      if (var2 == null) {
         throw new ArgumentNullException("destinationType");
      }

      if (var2 == e2) {
         var2 = this.u3();
      }

      return var2 == n3 ? com.aspose.slides.ms.System.Xml.f4.n5(var1.booleanValue()) : this.u3(var1, var2, null);
   }

   @Override
   public Object n5(com.aspose.slides.ms.System.j5 var1, com.aspose.slides.ms.System.y8 var2) {
      if (var2 == null) {
         throw new ArgumentNullException("destinationType");
      }

      if (var2 == e2) {
         var2 = this.u3();
      }

      return var2 == n3 ? c8(var1.m3()) : this.u3(var1.m3(), var2, null);
   }

   @Override
   public Object n5(com.aspose.slides.ms.System.c4 var1, com.aspose.slides.ms.System.y8 var2) {
      if (var2 == null) {
         throw new ArgumentNullException("destinationType");
      }

      if (var2 == e2) {
         var2 = this.u3();
      }

      return var2 == n3 ? com.aspose.slides.ms.System.Xml.f4.n5(var1.l6()) : this.u3(var1.l6(), var2, null);
   }

   @Override
   public Object n5(Double var1, com.aspose.slides.ms.System.y8 var2) {
      if (var2 == null) {
         throw new ArgumentNullException("destinationType");
      }

      if (var2 == e2) {
         var2 = this.u3();
      }

      return var2 == n3 ? com.aspose.slides.ms.System.Xml.f4.n5(var1.doubleValue()) : this.u3(var1, var2, null);
   }

   @Override
   public Object n5(Integer var1, com.aspose.slides.ms.System.y8 var2) {
      if (var2 == null) {
         throw new ArgumentNullException("destinationType");
      }

      if (var2 == e2) {
         var2 = this.u3();
      }

      return var2 == n3 ? com.aspose.slides.ms.System.Xml.f4.n5(var1.intValue()) : this.u3(var1, var2, null);
   }

   @Override
   public Object n5(Long var1, com.aspose.slides.ms.System.y8 var2) {
      if (var2 == null) {
         throw new ArgumentNullException("destinationType");
      }

      if (var2 == e2) {
         var2 = this.u3();
      }

      return var2 == n3 ? com.aspose.slides.ms.System.Xml.f4.n5(var1.longValue()) : this.u3(var1, var2, null);
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

      if (var2 == r4) {
         return com.aspose.slides.ms.System.Xml.f4.t2(var1);
      } else if (var2 == t9) {
         return u9(com.aspose.slides.ms.System.Xml.f4.e2(var1));
      } else if (var2 == c4) {
         return c8(var1);
      } else if (var2 == j5) {
         return y1(var1);
      } else if (var2 == w1) {
         return a0(var1);
      } else if (var2 == t2) {
         return com.aspose.slides.ms.System.Xml.f4.x8(var1);
      } else if (var2 == m3) {
         return com.aspose.slides.ms.System.Xml.f4.k7(var1);
      } else if (var2 == z1) {
         return h0(com.aspose.slides.ms.System.Xml.f4.e2(var1));
      } else if (var2 == s7) {
         return com.aspose.slides.ms.System.Xml.f4.e2(var1);
      } else if (var2 == x8) {
         return com.aspose.slides.ms.System.Xml.f4.t9(var1);
      } else if (var2 == t4) {
         return c8(com.aspose.slides.ms.System.Xml.f4.e2(var1));
      } else if (var2 == z8) {
         return com.aspose.slides.ms.System.Xml.f4.m1(var1);
      } else if (var2 == a0) {
         return n3(var1);
      } else if (var2 == q0) {
         return t2(com.aspose.slides.ms.System.Xml.f4.e2(var1));
      } else if (var2 == z3) {
         return h0(com.aspose.slides.ms.System.Xml.f4.t9(var1));
      } else if (var2 == m1) {
         return u3(com.aspose.slides.ms.System.Xml.f4.x8(var1).l6());
      } else if (var2 == y1) {
         return com.aspose.slides.ms.System.Xml.f4.z8(var1);
      } else if (var2 == y4) {
         return new x6(this.n5(), var1);
      } else if (var2 == y2) {
         return n5(var1, var3);
      } else if (var2 == k7) {
         return new x6(this.n5(), var1);
      } else {
         return var2 == n3 ? var1 : this.u3(var1, var2, var3);
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

      if (var2 == r4 && var4 == n3) {
         return com.aspose.slides.ms.System.Xml.f4.t2((String)var1);
      }

      if (var2 == t9 && var4 == n3) {
         return u9(com.aspose.slides.ms.System.Xml.f4.e2((String)var1));
      }

      if (var2 == c4 && var4 == n3) {
         return c8((String)var1);
      }

      if (var2 == j5 && var4 == n3) {
         return y1((String)var1);
      }

      if (var2 == w1 && var4 == n3) {
         return a0((String)var1);
      }

      if (var2 == t2 && var4 == n3) {
         return com.aspose.slides.ms.System.Xml.f4.x8((String)var1);
      }

      if (var2 == m3 && var4 == n3) {
         return com.aspose.slides.ms.System.Xml.f4.k7((String)var1);
      }

      if (var2 == z1 && var4 == n3) {
         return h0(com.aspose.slides.ms.System.Xml.f4.e2((String)var1));
      }

      if (var2 == s7 && var4 == n3) {
         return com.aspose.slides.ms.System.Xml.f4.e2((String)var1);
      }

      if (var2 == x8 && var4 == n3) {
         return com.aspose.slides.ms.System.Xml.f4.t9((String)var1);
      }

      if (var2 == t4 && var4 == n3) {
         return c8(com.aspose.slides.ms.System.Xml.f4.e2((String)var1));
      }

      if (var2 == z8 && var4 == n3) {
         return com.aspose.slides.ms.System.Xml.f4.m1((String)var1);
      }

      if (var2 == a0 && var4 == n3) {
         return n3((String)var1);
      }

      if (var2 == q0 && var4 == n3) {
         return t2(com.aspose.slides.ms.System.Xml.f4.e2((String)var1));
      }

      if (var2 == z3 && var4 == n3) {
         return h0(com.aspose.slides.ms.System.Xml.f4.t9((String)var1));
      }

      if (var2 == m1 && var4 == n3) {
         return u3(com.aspose.slides.ms.System.Xml.f4.x8((String)var1).l6());
      }

      if (var2 == y1 && var4 == n3) {
         return com.aspose.slides.ms.System.Xml.f4.z8((String)var1);
      }

      if (var2 == y4) {
         if (var4 == n3) {
            return new x6(this.n5(), (String)var1);
         }

         if (var4 == y4) {
            return (x6)var1;
         }
      }

      if (var2 == y2 && var4 == n3) {
         return n5((String)var1, var3);
      }

      if (var2 == k7) {
         if (var4 == n3) {
            return new x6(this.n5(), (String)var1);
         }

         if (var4 == y4) {
            return (x6)var1;
         }
      }

      if (var2 == n3) {
         return this.n5(var1, var3);
      } else if (var2 == y4) {
         return new x6(this.n5(), this.n5(var1, var3));
      } else if (var2 == k7) {
         return new x6(this.n5(), this.n5(var1, var3));
      } else {
         return var4 == y4 ? ((x6)var1).n5(var2, var3) : this.l6(var1, var2, var3);
      }
   }

   private Object k5(Object var1, com.aspose.slides.ms.System.y8 var2, com.aspose.slides.ms.System.Xml.a3 var3) {
      com.aspose.slides.ms.System.y8 var4 = com.aspose.slides.ms.System.j8.n5(var1);
      return var4 == y4 ? ((x6)var1).n5(var2, var3) : this.l6(var1, var2, var3);
   }

   private Object u3(Object var1, com.aspose.slides.ms.System.y8 var2, com.aspose.slides.ms.System.Xml.a3 var3) {
      if (var2 == y4) {
         return new x6(this.n5(), this.n5(var1, var3));
      } else {
         return var2 == k7 ? new x6(this.n5(), this.n5(var1, var3)) : this.l6(var1, var2, var3);
      }
   }

   @Override
   protected Object l6(Object var1, com.aspose.slides.ms.System.y8 var2, com.aspose.slides.ms.System.Xml.a3 var3) {
      com.aspose.slides.ms.System.y8 var4 = com.aspose.slides.ms.System.j8.n5(var1);
      if (this.d5 == null || !this.s3 && var4 != n3 && var2 != n3) {
         if (this.n5(var4)) {
            throw new InvalidCastException(
               com.aspose.slides.ms.System.Xml.v3.n5(
                  "Xml type '{0}' cannot convert from Clr type '{1}' unless the destination type is String or XmlAtomicValue.", this.k5(), var4.s7()
               )
            );
         } else if (this.n5(var2)) {
            throw new InvalidCastException(
               com.aspose.slides.ms.System.Xml.v3.n5(
                  "Xml type '{0}' cannot convert to Clr type '{1}' unless the source value is a String or an XmlAtomicValue.", this.k5(), var2.s7()
               )
            );
         } else {
            throw this.l6(var4, var2);
         }
      } else {
         return super.l6(var1, var2, var3);
      }
   }

   private boolean n5(com.aspose.slides.ms.System.y8 var1) {
      if (var1 == r4) {
         return true;
      } else if (var1 == t9) {
         return true;
      } else if (var1 == c4) {
         return true;
      } else if (var1 == j5) {
         return true;
      } else if (var1 == w1) {
         return true;
      } else if (var1 == t2) {
         return true;
      } else if (var1 == m3) {
         return true;
      } else if (var1 == z1) {
         return true;
      } else if (var1 == s7) {
         return true;
      } else if (var1 == x8) {
         return true;
      } else if (var1 == t4) {
         return true;
      } else if (var1 == z8) {
         return true;
      } else if (var1 == a0) {
         return true;
      } else if (var1 == q0) {
         return true;
      } else if (var1 == z3) {
         return true;
      } else if (var1 == m1) {
         return true;
      } else {
         return var1 == y1 ? true : var1 == y2;
      }
   }
}
