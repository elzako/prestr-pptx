package com.aspose.slides.internal.b8c;

import com.aspose.slides.exceptions.ArgumentNullException;

public class g6 extends m9 {
   protected g6(j9e var1) {
      super(var1);
   }

   public static e3m n5(j9e var0) {
      return new g6(var0);
   }

   @Override
   public com.aspose.slides.ms.System.c4 k5(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      } else {
         return this.l6() == 14 ? com.aspose.slides.ms.System.Xml.f4.x8(var1) : com.aspose.slides.ms.System.Xml.f4.n3(var1);
      }
   }

   @Override
   public com.aspose.slides.ms.System.c4 u3(Object var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      } else {
         com.aspose.slides.ms.System.y8 var2 = com.aspose.slides.ms.System.j8.n5(var1);
         if (var2 == t2) {
            return com.aspose.slides.internal.v6g.k5.u3(var1, com.aspose.slides.ms.System.c4.class);
         } else if (var2 == s7) {
            return com.aspose.slides.internal.v6g.k5.s7((Integer)var1, 9);
         } else if (var2 == x8) {
            return com.aspose.slides.internal.v6g.k5.s7((Long)var1, 11);
         } else if (var2 == n3) {
            return this.k5((String)var1);
         } else {
            return var2 == y4
               ? com.aspose.slides.internal.v6g.k5.u3(((x6)var1).n5(t2), com.aspose.slides.ms.System.c4.class)
               : com.aspose.slides.internal.v6g.k5.u3(this.k5(var1, t2, null), com.aspose.slides.ms.System.c4.class);
         }
      }
   }

   @Override
   public int u3(Long var1) {
      return u9(var1);
   }

   @Override
   public int a6(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      } else {
         return this.l6() == 14 ? l6(com.aspose.slides.ms.System.Xml.f4.x8(var1).l6()) : com.aspose.slides.ms.System.Xml.f4.e2(var1);
      }
   }

   @Override
   public int u9(Object var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      } else {
         com.aspose.slides.ms.System.y8 var2 = com.aspose.slides.ms.System.j8.n5(var1);
         if (var2 == t2) {
            return l6(com.aspose.slides.internal.v6g.k5.u3(var1, com.aspose.slides.ms.System.c4.class).l6());
         } else if (var2 == s7) {
            return com.aspose.slides.internal.v6g.k5.u3(var1, int.class);
         } else if (var2 == x8) {
            return u9(com.aspose.slides.internal.v6g.k5.u3(var1, long.class));
         } else if (var2 == n3) {
            return this.a6((String)var1);
         } else {
            return var2 == y4 ? ((x6)var1).t2() : com.aspose.slides.internal.v6g.k5.u3(this.k5(var1, s7, null), int.class);
         }
      }
   }

   @Override
   public long u3(Integer var1) {
      return var1.intValue();
   }

   @Override
   public long u9(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      } else {
         return this.l6() == 14 ? k5(com.aspose.slides.ms.System.Xml.f4.x8(var1).l6()) : com.aspose.slides.ms.System.Xml.f4.t9(var1);
      }
   }

   @Override
   public long h0(Object var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      } else {
         com.aspose.slides.ms.System.y8 var2 = com.aspose.slides.ms.System.j8.n5(var1);
         if (var2 == t2) {
            return k5(com.aspose.slides.internal.v6g.k5.u3(var1, com.aspose.slides.ms.System.c4.class).l6());
         } else if (var2 == s7) {
            return ((Integer)var1).intValue();
         } else if (var2 == x8) {
            return com.aspose.slides.internal.v6g.k5.u3(var1, long.class);
         } else if (var2 == n3) {
            return this.u9((String)var1);
         } else {
            return var2 == y4 ? ((x6)var1).s7() : com.aspose.slides.internal.v6g.k5.u3(this.k5(var1, x8, null), long.class);
         }
      }
   }

   @Override
   public String n5(com.aspose.slides.ms.System.c4 var1) {
      return this.l6() == 14
         ? com.aspose.slides.ms.System.Xml.f4.n5(var1.l6())
         : com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.ms.System.c4.t2(var1.l6()).l6());
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
   public String n5(Object var1, com.aspose.slides.ms.System.Xml.a3 var2) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      } else {
         com.aspose.slides.ms.System.y8 var3 = com.aspose.slides.ms.System.j8.n5(var1);
         if (var3 == t2) {
            return this.n5(com.aspose.slides.internal.v6g.k5.u3(var1, com.aspose.slides.ms.System.c4.class).l6());
         } else if (var3 == s7) {
            return com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(var1, int.class).intValue());
         } else if (var3 == x8) {
            return com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(var1, long.class).longValue());
         } else if (var3 == n3) {
            return (String)var1;
         } else {
            return var3 == y4 ? ((x6)var1).c8() : (String)this.k5(var1, n3, var2);
         }
      }
   }

   @Override
   public Object n5(com.aspose.slides.ms.System.c4 var1, com.aspose.slides.ms.System.y8 var2) {
      if (var2 == null) {
         throw new ArgumentNullException("destinationType");
      }

      if (var2 == e2) {
         var2 = this.u3();
      }

      if (var2 == t2) {
         return var1;
      } else if (var2 == s7) {
         return l6(var1.l6());
      } else if (var2 == x8) {
         return k5(var1.l6());
      } else if (var2 == n3) {
         return this.n5(var1.l6());
      } else if (var2 == y4) {
         return new x6(this.n5(), var1.l6());
      } else {
         return var2 == k7 ? new x6(this.n5(), var1.l6()) : this.u3(var1.l6(), var2, null);
      }
   }

   @Override
   public Object n5(Integer var1, com.aspose.slides.ms.System.y8 var2) {
      if (var2 == null) {
         throw new ArgumentNullException("destinationType");
      }

      if (var2 == e2) {
         var2 = this.u3();
      }

      if (var2 == t2) {
         return com.aspose.slides.internal.v6g.k5.s7(var1, 9);
      } else if (var2 == s7) {
         return var1;
      } else if (var2 == x8) {
         return (long)var1.intValue();
      } else if (var2 == n3) {
         return com.aspose.slides.ms.System.Xml.f4.n5(var1.intValue());
      } else if (var2 == y4) {
         return new x6(this.n5(), var1.intValue());
      } else {
         return var2 == k7 ? new x6(this.n5(), var1.intValue()) : this.u3(var1, var2, null);
      }
   }

   @Override
   public Object n5(Long var1, com.aspose.slides.ms.System.y8 var2) {
      if (var2 == null) {
         throw new ArgumentNullException("destinationType");
      }

      if (var2 == e2) {
         var2 = this.u3();
      }

      if (var2 == t2) {
         return com.aspose.slides.internal.v6g.k5.s7(var1, 11);
      } else if (var2 == s7) {
         return u9(var1);
      } else if (var2 == x8) {
         return var1;
      } else if (var2 == n3) {
         return com.aspose.slides.ms.System.Xml.f4.n5(var1.longValue());
      } else if (var2 == y4) {
         return new x6(this.n5(), var1.longValue());
      } else {
         return var2 == k7 ? new x6(this.n5(), var1.longValue()) : this.u3(var1, var2, null);
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

      if (var2 == t2) {
         return this.k5(var1);
      } else if (var2 == s7) {
         return this.a6(var1);
      } else if (var2 == x8) {
         return this.u9(var1);
      } else if (var2 == n3) {
         return var1;
      } else if (var2 == y4) {
         return new x6(this.n5(), var1);
      } else {
         return var2 == k7 ? new x6(this.n5(), var1) : this.u3(var1, var2, var3);
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

      if (var2 == t2) {
         return this.u3(var1);
      }

      if (var2 == s7) {
         return this.u9(var1);
      }

      if (var2 == x8) {
         return this.h0(var1);
      }

      if (var2 == n3) {
         return this.n5(var1, var3);
      }

      if (var2 == y4) {
         if (var4 == t2) {
            return new x6(this.n5(), var1);
         }

         if (var4 == s7) {
            return new x6(this.n5(), com.aspose.slides.internal.v6g.k5.u3(var1, int.class));
         }

         if (var4 == x8) {
            return new x6(this.n5(), com.aspose.slides.internal.v6g.k5.u3(var1, long.class));
         }

         if (var4 == n3) {
            return new x6(this.n5(), (String)var1);
         }

         if (var4 == y4) {
            return (x6)var1;
         }
      }

      if (var2 == k7) {
         if (var4 == t2) {
            return new x6(this.n5(), var1);
         }

         if (var4 == s7) {
            return new x6(this.n5(), com.aspose.slides.internal.v6g.k5.u3(var1, int.class));
         }

         if (var4 == x8) {
            return new x6(this.n5(), com.aspose.slides.internal.v6g.k5.u3(var1, long.class));
         }

         if (var4 == n3) {
            return new x6(this.n5(), (String)var1);
         }

         if (var4 == y4) {
            return (x6)var1;
         }
      }

      if (var2 == t9) {
         return u9(this.u9(var1));
      } else if (var2 == z1) {
         return h0(this.u9(var1));
      } else if (var2 == t4) {
         return c8(this.u9(var1));
      } else if (var2 == q0) {
         return t2(this.u9(var1));
      } else if (var2 == z3) {
         return h0(this.h0(var1));
      } else if (var2 == m1) {
         return u3(this.u3(var1).l6());
      } else if (var4 == t9 && this.l6() == 51) {
         return this.n5((Byte)var1 & 255, var2);
      } else if (var4 == z1) {
         return this.n5(Integer.valueOf((Short)var1), var2);
      } else if (var4 == t4) {
         return this.n5(Integer.valueOf((Byte)var1), var2);
      } else if (var4 == q0) {
         return this.n5((Integer)var1 & 65535, var2);
      } else if (var4 == z3) {
         return this.n5((Long)var1 & 4294967295L, var2);
      } else {
         return var4 == m1 ? this.n5(com.aspose.slides.internal.v6g.k5.s7((Long)var1, 12).l6(), var2) : this.l6(var1, var2, var3);
      }
   }

   private Object k5(Object var1, com.aspose.slides.ms.System.y8 var2, com.aspose.slides.ms.System.Xml.a3 var3) {
      com.aspose.slides.ms.System.y8 var4 = com.aspose.slides.ms.System.j8.n5(var1);
      if (var4 == t9 && this.l6() == 51) {
         return this.n5((Byte)var1 & 255, var2);
      } else if (var4 == z1) {
         return this.n5(Integer.valueOf((Short)var1), var2);
      } else if (var4 == t4) {
         return this.n5(Integer.valueOf((Byte)var1), var2);
      } else if (var4 == q0) {
         return this.n5((Integer)var1 & 65535, var2);
      } else if (var4 == z3) {
         return this.n5((Long)var1 & 4294967295L, var2);
      } else {
         return var4 == m1 ? this.n5(com.aspose.slides.internal.v6g.k5.s7((Long)var1, 12).l6(), var2) : this.l6(var1, var2, var3);
      }
   }

   private Object u3(Object var1, com.aspose.slides.ms.System.y8 var2, com.aspose.slides.ms.System.Xml.a3 var3) {
      if (var2 == t9) {
         return u9(this.u9(var1));
      } else if (var2 == z1) {
         return h0(this.u9(var1));
      } else if (var2 == t4) {
         return c8(this.u9(var1));
      } else if (var2 == q0) {
         return t2(this.u9(var1));
      } else if (var2 == z3) {
         return h0(this.h0(var1));
      } else {
         return var2 == m1 ? u3(this.u3(var1).l6()) : this.l6(var1, var2, var3);
      }
   }
}
