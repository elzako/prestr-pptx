package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.b8c.a9;
import com.aspose.slides.internal.b8c.j2;
import com.aspose.slides.internal.b8c.j9e;
import com.aspose.slides.internal.b8c.k9m;
import com.aspose.slides.internal.b8c.l2;
import com.aspose.slides.internal.b8c.u1s;
import com.aspose.slides.internal.b8c.v1;
import com.aspose.slides.internal.b8c.v7u;
import com.aspose.slides.internal.b8c.x4;

public class c6 extends c7 implements com.aspose.slides.internal.b8c.u4, a3, f0 {
   private c7 n5;
   private a3 l6;
   private a3 k5;
   private v7u u3;
   private o8 a6;
   private com.aspose.slides.internal.b8c.b4 u9;
   private int h0;
   private k9m c8;
   private s2 t2;
   private boolean s7;
   private boolean x8;
   private boolean n3;
   private k8 y4;
   private n5 e2;
   private int t9;
   private int z1;
   private int t4;
   private n5[] q0;
   private ArrayList z3;
   private com.aspose.slides.internal.b8c.n7 m1 = null;
   private Object k7;
   private j2 m3;
   private String z8;
   private z9 j5;
   private i7 w1;
   private k8 r4;
   private String c4;
   private String y2;
   private String y1;
   private String a0;
   private String d2;
   private String d5;
   private String s3;
   private String p8;
   private u4 f2 = u4.n5().l6();
   private f0 i1;
   private w2 e5;
   private int b3;
   private static volatile com.aspose.slides.ms.System.y8 o0;

   public c6(c7 var1, o8 var2, w4 var3, x4 var4) {
      this.n5 = var1;
      this.l6 = com.aspose.slides.internal.v6g.k5.n5(var1, a3.class);
      this.i1 = com.aspose.slides.internal.v6g.k5.n5(var1, f0.class);
      this.j5 = this.n5.y1();
      if (this.l6 == null) {
         this.t2 = new s2(this.j5);
         this.s7 = true;
      }

      this.k5 = com.aspose.slides.internal.v6g.k5.n5(this, a3.class);
      this.a6 = var2;
      this.x8 = (var3.t4() & 1) != 0;
      this.t2();
      this.n5(var3, var1, var4);
      this.u9 = var3.m1();
   }

   public c6(c7 var1, o8 var2, w4 var3) {
      this(var1, var2, var3, null);
   }

   private void t2() {
      this.h0 = 1;
      this.z3 = new ArrayList();
      this.t4 = -1;
      this.q0 = new n5[8];
      this.c8 = new x1(this);
      o0 = com.aspose.slides.internal.v6g.k5.n5(String.class);
      this.m3 = new j2();
      this.c4 = this.j5.n5("http://www.w3.org/2000/xmlns/");
      this.y2 = this.j5.n5("http://www.w3.org/2001/XMLSchema");
      this.y1 = this.j5.n5("http://www.w3.org/2001/XMLSchema-instance");
      this.a0 = this.j5.n5("type");
      this.d2 = this.j5.n5("nil");
      this.s3 = this.j5.n5("schemaLocation");
      this.p8 = this.j5.n5("noNamespaceSchemaLocation");
      this.d5 = this.j5.n5("Schema");
   }

   private void n5(w4 var1, c7 var2, x4 var3) {
      this.u3 = new v7u(this.j5, var1.q0(), this.k5, var1.t4());
      this.u3.n5(this.a6);
      this.u3.n5(f4.z8(var2.q0()));
      this.u3.n5(this);
      this.u3.l6.l6(var1.m1());
      this.u3.n5(this.i1);
      if (this.u3.x8()) {
         this.u3.k5().y4().u3(var1.e2());
      }

      this.u3.n5(var2.d2());
      if (var3 != null) {
         this.u3.n5(var3);
      } else {
         this.u3.n5();
      }
   }

   @Override
   public w4 n5() {
      w4 var1 = this.n5.n5();
      if (null != var1) {
         var1 = var1.z3();
      }

      if (var1 == null) {
         var1 = new w4();
      }

      var1.n5(this.u3.k5());
      var1.a6(4);
      var1.u9(this.u3.u3());
      var1.h0(true);
      return var1;
   }

   @Override
   public int s7() {
      if (this.h0 < 0) {
         return this.y4.h0();
      }

      int var1 = this.n5.s7();
      return var1 != 13 || this.u3.a6() != 0 && this.u3.a6() != 3 ? var1 : 14;
   }

   @Override
   public String x8() {
      if (this.h0 == -1) {
         String var1 = this.u3.u3(this.y4.l6());
         return var1 != null && var1.length() != 0
            ? com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.d1.n5(new String[]{var1, ":", this.y4.n5()})})
            : this.y4.n5();
      } else {
         return this.n5.x8();
      }
   }

   @Override
   public String n3() {
      return this.h0 < 0 ? this.y4.n5() : this.n5.n3();
   }

   @Override
   public String y4() {
      return this.h0 < 0 ? this.y4.l6() : this.n5.y4();
   }

   @Override
   public String e2() {
      return this.h0 < 0 ? this.y4.k5() : this.n5.e2();
   }

   @Override
   public boolean t9() {
      return this.h0 < 0 ? true : this.n5.t9();
   }

   @Override
   public String z1() {
      return this.h0 < 0 ? this.y4.a6() : this.n5.z1();
   }

   @Override
   public int t4() {
      return this.h0 < 0 ? this.y4.u3() : this.n5.t4();
   }

   @Override
   public String q0() {
      return this.n5.q0();
   }

   @Override
   public boolean m1() {
      return this.n5.m1();
   }

   @Override
   public boolean l6() {
      return this.h0 == -1 ? true : this.n5.l6();
   }

   @Override
   public char d5() {
      return this.n5.d5();
   }

   @Override
   public int k7() {
      return this.n5.k7();
   }

   @Override
   public com.aspose.slides.internal.b8c.u4 m3() {
      return com.aspose.slides.internal.v6g.k5.n5(this, com.aspose.slides.internal.b8c.u4.class);
   }

   @Override
   public int z8() {
      return this.t9;
   }

   @Override
   public String u3(String var1) {
      String var2 = this.n5.u3(var1);
      if (var2 == null && this.t9 > 0) {
         k8 var3 = this.n5(var1, false);
         if (var3 != null) {
            var2 = var3.a6();
         }
      }

      return var2;
   }

   @Override
   public String k5(int var1) {
      if (this.t9 == 0) {
         return null;
      }

      if (var1 < this.z1) {
         return this.n5.k5(var1);
      }

      int var2 = var1 - this.z1;
      k8 var3 = (k8)this.z3.get_Item(var2);
      return var3.a6();
   }

   @Override
   public boolean k5(String var1) {
      if (this.n5.k5(var1)) {
         this.h0 = 3;
         this.e2 = this.h0(var1);
         if (this.h0 == 7) {
            this.e5.n5();
            this.h0 = this.b3;
         }

         return true;
      } else {
         if (this.t9 > 0) {
            k8 var2 = this.n5(var1, true);
            if (var2 != null) {
               this.h0 = -1;
               this.e2 = var2.c8();
               this.y4 = var2;
               if (this.h0 == 7) {
                  this.e5.n5();
                  this.h0 = this.b3;
               }

               return true;
            }
         }

         return false;
      }
   }

   @Override
   public void l6(int var1) {
      if (var1 >= 0 && var1 < this.t9) {
         this.t4 = var1;
         if (var1 < this.z1) {
            this.n5.l6(var1);
            if (this.m1 == null) {
               this.e2 = this.q0[var1];
            } else {
               this.e2 = null;
            }

            this.h0 = 3;
         } else {
            int var2 = var1 - this.z1;
            this.y4 = (k8)this.z3.get_Item(var2);
            this.e2 = this.y4.c8();
            this.h0 = -1;
         }

         if (this.h0 == 7) {
            this.e5.n5();
            this.h0 = this.b3;
         }
      } else {
         throw new ArgumentOutOfRangeException("i");
      }
   }

   @Override
   public boolean k5() {
      if (this.n5.k5()) {
         this.t4 = 0;
         if (this.m1 == null) {
            this.e2 = this.q0[0];
         } else {
            this.e2 = null;
         }

         this.h0 = 3;
         if (this.h0 == 7) {
            this.e5.n5();
            this.h0 = this.b3;
         }

         return true;
      } else if (this.z3.size() > 0) {
         this.y4 = (k8)this.z3.get_Item(0);
         this.e2 = this.y4.c8();
         this.t4 = 0;
         this.h0 = -1;
         if (this.h0 == 7) {
            this.e5.n5();
            this.h0 = this.b3;
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean u3() {
      if (this.t4 + 1 < this.z1) {
         boolean var2 = this.n5.u3();
         this.t4++;
         if (this.m1 == null) {
            this.e2 = this.q0[this.t4];
         } else {
            this.e2 = null;
         }

         this.h0 = 3;
         if (this.h0 == 7) {
            this.e5.n5();
            this.h0 = this.b3;
         }

         return true;
      } else if (this.t4 + 1 < this.t9) {
         int var1 = ++this.t4 - this.z1;
         this.y4 = (k8)this.z3.get_Item(var1);
         this.e2 = this.y4.c8();
         this.h0 = -1;
         if (this.h0 == 7) {
            this.e5.n5();
            this.h0 = this.b3;
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a6() {
      if (!this.n5.a6() && this.h0 >= 0) {
         return false;
      }

      this.t4 = -1;
      this.h0 = 4;
      return true;
   }

   @Override
   public boolean u9() {
      switch (this.h0) {
         case -2:
         case -1:
         case 3:
         case 4:
            this.v0();
            if (this.m1 != null) {
               this.h0 = 5;
               this.f0();
               return true;
            } else {
               this.h0 = 2;
               if (this.n5.u9()) {
                  this.u6();
                  return true;
               }

               this.u3.l6();
               if (this.n5.j5()) {
                  this.h0 = 9;
               }

               return false;
            }
         case 0:
         default:
            return false;
         case 1:
            this.h0 = 2;
            if (this.n5.h0() == 1) {
               this.u6();
               return true;
            } else {
               if (this.n5.u9()) {
                  this.u6();
                  return true;
               }

               this.u3.l6();
               if (this.n5.j5()) {
                  this.h0 = 9;
               }

               return false;
            }
         case 2:
            if (this.n5.u9()) {
               this.u6();
               return true;
            }

            this.u3.l6();
            if (this.n5.j5()) {
               this.h0 = 9;
            }

            return false;
         case 5:
            this.f0();
            return true;
         case 6:
            this.v0();
            this.u6();
            this.h0 = 2;
            return true;
         case 7:
            this.h0 = this.b3;
            this.e5.n5();
            return this.u9();
         case 8:
         case 9:
            return false;
      }
   }

   @Override
   public boolean j5() {
      return this.n5.j5();
   }

   @Override
   public void w1() {
      this.n5.w1();
      this.h0 = 8;
   }

   @Override
   public int h0() {
      return this.h0 == 1 ? 0 : this.n5.h0();
   }

   @Override
   public void r4() {
      int var1 = this.t4();
      switch (this.s7()) {
         case 1:
            if (!this.n5.m1()) {
               boolean var3 = true;
               if ((this.m3.t2() || this.m3.l6()) && com.aspose.slides.internal.v6g.k5.l6(this.n5, i7.class)) {
                  var3 = false;
               }

               this.n5.r4();
               this.h0 = 6;
               if (var3) {
                  this.u3.k5(this.m3);
               }
            }
            break;
         case 2:
            this.a6();
            if (!this.n5.m1()) {
               boolean var2 = true;
               if ((this.m3.t2() || this.m3.l6()) && com.aspose.slides.internal.v6g.k5.l6(this.n5, i7.class)) {
                  var2 = false;
               }

               this.n5.r4();
               this.h0 = 6;
               if (var2) {
                  this.u3.k5(this.m3);
               }
            }
      }

      this.u9();
   }

   @Override
   public z9 y1() {
      return this.j5;
   }

   @Override
   public String n5(String var1) {
      return this.k5.n5(var1);
   }

   @Override
   public void a0() {
      throw new InvalidOperationException();
   }

   @Override
   public boolean c8() {
      if (this.h0 == 7) {
         this.e5.n5();
         this.h0 = this.b3;
      }

      if (this.s7() == 2) {
         if (this.h0 == -1) {
            this.y4 = this.n5(this.y4.a6(), this.y4.u3() + 1);
            this.h0 = -2;
            return true;
         } else {
            return this.n5.c8();
         }
      } else {
         return false;
      }
   }

   @Override
   public final boolean aj_() {
      switch (this.s7()) {
         case 1:
         case 15:
            return this.m3.aj_();
         default:
            return false;
      }
   }

   @Override
   public final int ak_() {
      switch (this.s7()) {
         case 1:
            if (this.n5.m1()) {
               return this.m3.ak_();
            } else {
               if (this.m3.ak_() == 1) {
                  return 0;
               }

               return this.m3.ak_();
            }
         case 2:
            if (this.e2 != null) {
               return this.v4().ak_();
            }
         default:
            return 0;
         case 15:
            return this.m3.ak_();
      }
   }

   @Override
   public final u1s al_() {
      switch (this.s7()) {
         case 1:
            if (!this.n5.m1()) {
               this.p3();
            }

            return this.m3.al_();
         case 2:
            if (this.e2 != null) {
               return this.v4().al_();
            }

            return null;
         case 15:
            return this.m3.al_();
         default:
            return null;
      }
   }

   @Override
   public final j9e am_() {
      switch (this.s7()) {
         case 1:
         case 15:
            return this.m3.am_();
         case 2:
            if (this.e2 != null) {
               return this.v4().am_();
            }

            return null;
         default:
            return null;
      }
   }

   @Override
   public final v1 an_() {
      return this.s7() != 1 && this.s7() != 15 ? null : this.m3.an_();
   }

   @Override
   public final l2 ao_() {
      return this.s7() == 2 && this.e2 != null ? this.v4().ao_() : null;
   }

   @Override
   public final boolean ag_() {
      return true;
   }

   @Override
   public final int ah_() {
      return this.i1 != null ? this.i1.ah_() : 0;
   }

   @Override
   public final int ai_() {
      return this.i1 != null ? this.i1.ai_() : 0;
   }

   @Override
   public final IGenericDictionary<String, String> n5(int var1) {
      return this.l6 != null ? this.l6.n5(var1) : this.t2.n5(var1);
   }

   @Override
   public final String l6(String var1) {
      return this.l6 != null ? this.l6.l6(var1) : this.t2.l6(var1);
   }

   private Object z7() {
      return this.n5.z1();
   }

   private j2 v4() {
      return this.e2.u3;
   }

   private void u6() {
      if (!this.n3) {
         switch (this.n5.s7()) {
            case 1:
               this.t1();
            case 2:
            case 6:
            case 7:
            case 8:
            case 9:
            case 11:
            case 12:
            default:
               break;
            case 3:
            case 4:
               this.u3.n5(new b8(this));
               break;
            case 5:
               throw new InvalidOperationException();
            case 10:
               this.u3.n5(this.n5.d2());
               break;
            case 13:
            case 14:
               this.u3.l6(new b7(this));
               break;
            case 15:
               this.a5();
         }
      }
   }

   private void t1() {
      if (this.x8 && this.k5(this.n5.n3(), this.n5.y4()) && this.n5.t4() > 0) {
         this.m3.s7();
         this.t9 = this.z1 = this.n5.z8();
         if (!this.n5.m1()) {
            this.m1 = new com.aspose.slides.internal.b8c.n7(3, this.j5, this.u3.k5().n5(this.j5), this.u9);
            this.m1.l6(this.n5, null);
            this.m1.u3();
            this.h0 = 5;
         } else {
            this.h0 = 4;
         }
      } else {
         this.k7 = null;
         this.z8 = null;
         this.m3.s7();
         if (this.s7) {
            this.t2.k5();
         }

         String var1 = null;
         String var2 = null;
         String var3 = null;
         String var4 = null;
         if (this.n5.k5()) {
            do {
               String var5 = this.n5.y4();
               String var6 = this.n5.n3();
               if (v8.n5(var5, this.y1)) {
                  if (v8.n5(var6, this.s3)) {
                     var1 = this.n5.z1();
                  } else if (v8.n5(var6, this.p8)) {
                     var2 = this.n5.z1();
                  } else if (v8.n5(var6, this.a0)) {
                     var4 = this.n5.z1();
                  } else if (v8.n5(var6, this.d2)) {
                     var3 = this.n5.z1();
                  }
               }

               if (this.s7 && v8.n5(this.n5.y4(), this.c4)) {
                  this.t2.n5(this.n5.e2().length() == 0 ? com.aspose.slides.ms.System.d1.n5 : this.n5.n3(), this.n5.z1());
               }
            } while (this.n5.u3());

            this.n5.a6();
         }

         this.u3.n5(this.n5.n3(), this.n5.y4(), this.m3, var4, var3, var1, var2);
         this.h2();
         this.u3.n5(this.m3);
         if (this.n5.m1()) {
            this.a5();
         }

         this.h0 = 4;
      }
   }

   private void a5() {
      this.k7 = this.u3.l6(this.m3);
      this.z8 = this.y0();
      if (this.m3.l6()) {
         int var1 = this.n5.t4();
         this.n5 = this.x9();
         this.w1.n5(this.m3.c8().z7().t2(this.k7), this.z8, var1 + 1, 0, 0);
         this.w1.t2();
         this.w1.z7();
         this.n3 = true;
      } else if (this.s7) {
         this.t2.u3();
      }
   }

   private void h2() {
      this.t9 = this.z1 = this.n5.z8();
      int var1 = 0;
      boolean var2 = false;
      if (this.n5.k5()) {
         do {
            String var3 = this.n5.n3();
            String var4 = this.n5.y4();
            n5 var5 = this.u9(var1);
            var5.n5 = var3;
            var5.l6 = var4;
            if (var4 == this.c4) {
               var1++;
            } else {
               var5.k5 = this.u3.n5(var3, var4, this.c8, var5.u3);
               if (!var2) {
                  var2 = var5.u3.ak_() == 2;
               }

               var1++;
            }
         } while (this.n5.u3());
      }

      this.n5.a6();
      if (var2) {
         this.m3.n5(2);
      }

      this.u3.n5(this.z3, true);
      this.t9 = this.t9 + this.z3.size();
   }

   private void v0() {
      this.t9 = 0;
      this.z1 = 0;
      this.t4 = -1;
      this.z3.clear();
      this.e2 = null;
   }

   private n5 h0(String var1) {
      if (this.m1 != null) {
         return null;
      }

      String var2 = null;
      String var3 = null;
      String[] var4 = new String[]{var3};
      String[] var5 = new String[]{var2};
      y5.l6(var1, var4, var5);
      var3 = var4[0];
      var2 = var5[0];
      var3 = this.j5.n5(var3);
      var2 = this.j5.n5(var2);
      String var6;
      if (var3.length() == 0) {
         var6 = com.aspose.slides.ms.System.d1.n5;
      } else {
         var6 = this.k5.n5(var3);
      }

      return this.l6(var2, var6);
   }

   private n5 l6(String var1, String var2) {
      n5 var3 = null;

      for (int var4 = 0; var4 < this.z1; var4++) {
         var3 = this.q0[var4];
         if (var3 != null && v8.n5(var1, var3.n5) && v8.n5(var2, var3.l6)) {
            this.t4 = var4;
            return var3;
         }
      }

      return null;
   }

   private k8 n5(String var1, boolean var2) {
      String var3 = null;
      String var4 = null;
      String[] var5 = new String[]{var4};
      String[] var6 = new String[]{var3};
      y5.l6(var1, var5, var6);
      var4 = var5[0];
      var3 = var6[0];
      var4 = this.j5.n5(var4);
      var3 = this.j5.n5(var3);
      String var7;
      if (var4.length() == 0) {
         var7 = com.aspose.slides.ms.System.d1.n5;
      } else {
         var7 = this.k5.n5(var4);
      }

      return this.n5(var3, var7, var2);
   }

   private k8 n5(String var1, String var2, boolean var3) {
      k8 var4 = null;

      for (int var5 = 0; var5 < this.z3.size(); var5++) {
         var4 = (k8)this.z3.get_Item(var5);
         if (v8.n5(var4.n5(), var1) && v8.n5(var4.l6(), var2)) {
            if (var3) {
               this.t4 = this.n5.z8() + var5;
            }

            return var4;
         }
      }

      return null;
   }

   private n5 u9(int var1) {
      n5 var2 = this.q0[var1];
      if (var2 != null) {
         var2.n5();
         return var2;
      }

      if (var1 >= this.q0.length - 1) {
         n5[] var3 = new n5[this.q0.length * 2];
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.q0)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var3)), 0, this.q0.length);
         this.q0 = var3;
      }

      var2 = this.q0[var1];
      if (var2 == null) {
         var2 = new n5();
         this.q0[var1] = var2;
      }

      return var2;
   }

   private boolean k5(String var1, String var2) {
      return v8.n5(var2, this.y2) && v8.n5(var1, this.d5);
   }

   private void f0() {
      if (this.n5.u9()) {
         if (this.n5.s7() == 1) {
            this.t9 = this.z1 = this.n5.z8();
         } else {
            this.v0();
         }

         if (!this.m1.u3()) {
            this.m1.n5();
            a9 var1 = this.m1.l6();
            this.u3.n5(var1);
            this.m1 = null;
            this.h0 = 2;
         }
      }
   }

   private void a3() {
      while (this.n5.u9()) {
         switch (this.n5.s7()) {
            case 1:
            case 2:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            default:
               break;
            case 3:
            case 4:
               this.u3.n5(new q7(this));
               break;
            case 13:
            case 14:
               this.u3.l6(new r3(this));
               break;
            case 15:
               this.k7 = this.u3.l6(this.m3);
               this.z8 = this.y0();
               if (this.k7 == null) {
                  this.k7 = this;
               } else if (this.m3.l6()) {
                  this.w1.l6(this.m3.c8().z7().t2(this.k7), this.z8);
                  return;
               }

               return;
         }
      }
   }

   private void p3() {
      if (this.m3.al_() == null && this.k7 != this) {
         i7 var1 = com.aspose.slides.internal.v6g.k5.n5(this.n5, i7.class);
         if (var1 == null && this.m3.t2() && !this.m3.aj_()) {
            this.n5 = this.x9();
            this.a3();
            this.w1.z7();
            this.n3 = true;
         }
      }
   }

   private i7 x9() {
      if (this.w1 == null) {
         this.w1 = new i7(this.n5, this.i1, new s6(this));
      } else {
         this.w1.l6(this.n5);
      }

      this.i1 = com.aspose.slides.internal.v6g.k5.n5(this.w1, f0.class);
      return this.w1;
   }

   public final k8 n5(String var1, int var2) {
      if (this.r4 == null) {
         this.r4 = new k8(3);
      }

      this.r4.n5(var2);
      this.r4.u3(var1);
      return this.r4;
   }

   public final void n5(i7 var1) {
      this.n5 = var1.v4();
      this.i1 = var1.u6();
      this.n3 = false;
   }

   private String y0() {
      if (this.m3.l6()) {
         v1 var1 = this.m3.an_();
         if (var1 != null) {
            return var1.h0() != null ? var1.h0() : var1.s7();
         } else {
            return com.aspose.slides.ms.System.d1.n5;
         }
      } else {
         return this.u3.h0();
      }
   }

   // $VF: synthetic method
   static Object n5(c6 var0) {
      return var0.z7();
   }
}
