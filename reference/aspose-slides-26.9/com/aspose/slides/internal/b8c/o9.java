package com.aspose.slides.internal.b8c;

import com.aspose.slides.exceptions.ArgumentNullException;

public class o9 extends m9 {
   protected o9(j9e var1) {
      super(var1);
   }

   public static e3m n5(j9e var0) {
      return new o9(var0);
   }

   @Override
   public double u3(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      } else {
         return this.l6() == 15 ? com.aspose.slides.ms.System.Xml.f4.m1(var1) : com.aspose.slides.ms.System.Xml.f4.k7(var1);
      }
   }

   @Override
   public double a6(Object var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      } else {
         com.aspose.slides.ms.System.y8 var2 = com.aspose.slides.ms.System.j8.n5(var1);
         if (var2 == m3) {
            return com.aspose.slides.internal.v6g.k5.u3(var1, double.class);
         } else if (var2 == z8) {
            return ((Float)var1).floatValue();
         } else if (var2 == n3) {
            return this.u3((String)var1);
         } else {
            return var2 == y4 ? ((x6)var1).h0() : com.aspose.slides.internal.v6g.k5.u3(this.l6(var1, m3, null), double.class);
         }
      }
   }

   @Override
   public float a6(Double var1) {
      return (float)var1.doubleValue();
   }

   @Override
   public float h0(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      } else {
         return this.l6() == 15 ? com.aspose.slides.ms.System.Xml.f4.m1(var1) : (float)com.aspose.slides.ms.System.Xml.f4.k7(var1);
      }
   }

   @Override
   public float c8(Object var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      } else {
         com.aspose.slides.ms.System.y8 var2 = com.aspose.slides.ms.System.j8.n5(var1);
         if (var2 == m3) {
            return com.aspose.slides.internal.v6g.k5.u3(var1, double.class).floatValue();
         } else if (var2 == z8) {
            return com.aspose.slides.internal.v6g.k5.u3(var1, float.class);
         } else if (var2 == n3) {
            return this.h0((String)var1);
         } else {
            return var2 == y4
               ? com.aspose.slides.internal.v6g.k5.u3(((x6)var1).n5(z8), float.class)
               : com.aspose.slides.internal.v6g.k5.u3(this.l6(var1, z8, null), float.class);
         }
      }
   }

   @Override
   public String u9(Double var1) {
      return this.l6() == 15 ? com.aspose.slides.ms.System.Xml.f4.n5(this.a6(var1)) : com.aspose.slides.ms.System.Xml.f4.n5(var1.doubleValue());
   }

   @Override
   public String n5(Float var1) {
      return this.l6() == 15 ? com.aspose.slides.ms.System.Xml.f4.n5(var1.floatValue()) : com.aspose.slides.ms.System.Xml.f4.n5((double)var1.floatValue());
   }

   @Override
   public String n5(Object var1, com.aspose.slides.ms.System.Xml.a3 var2) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      } else {
         com.aspose.slides.ms.System.y8 var3 = com.aspose.slides.ms.System.j8.n5(var1);
         if (var3 == m3) {
            return this.u9(com.aspose.slides.internal.v6g.k5.u3(var1, double.class));
         } else if (var3 == z8) {
            return this.n5(com.aspose.slides.internal.v6g.k5.u3(var1, float.class));
         } else if (var3 == n3) {
            return (String)var1;
         } else {
            return var3 == y4 ? ((x6)var1).c8() : (String)this.l6(var1, n3, var2);
         }
      }
   }

   @Override
   public Object n5(Double var1, com.aspose.slides.ms.System.y8 var2) {
      if (var2 == null) {
         throw new ArgumentNullException("destinationType");
      }

      if (var2 == e2) {
         var2 = this.u3();
      }

      if (var2 == m3) {
         return var1;
      } else if (var2 == z8) {
         return (float)var1.doubleValue();
      } else if (var2 == n3) {
         return this.u9(var1);
      } else if (var2 == y4) {
         return new x6(this.n5(), var1.doubleValue());
      } else {
         return var2 == k7 ? new x6(this.n5(), var1.doubleValue()) : this.l6(var1, var2, null);
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

      if (var2 == m3) {
         return this.u3(var1);
      } else if (var2 == z8) {
         return this.h0(var1);
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

      if (var2 == m3) {
         return this.a6(var1);
      }

      if (var2 == z8) {
         return this.c8(var1);
      }

      if (var2 == n3) {
         return this.n5(var1, var3);
      }

      if (var2 == y4) {
         if (var4 == m3) {
            return new x6(this.n5(), com.aspose.slides.internal.v6g.k5.u3(var1, double.class));
         }

         if (var4 == z8) {
            return new x6(this.n5(), var1);
         }

         if (var4 == n3) {
            return new x6(this.n5(), (String)var1);
         }

         if (var4 == y4) {
            return (x6)var1;
         }
      }

      if (var2 == k7) {
         if (var4 == m3) {
            return new x6(this.n5(), com.aspose.slides.internal.v6g.k5.u3(var1, double.class));
         }

         if (var4 == z8) {
            return new x6(this.n5(), var1);
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
