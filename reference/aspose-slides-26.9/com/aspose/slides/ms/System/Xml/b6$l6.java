package com.aspose.slides.ms.System.Xml;

class b6$l6 {
   private com.aspose.slides.internal.l7h.a5 n5 = new com.aspose.slides.internal.l7h.a5();
   private String l6;
   private b6$l6$l6[] k5;
   private int u3;
   private int a6 = -1;

   private b6$l6() {
   }

   public final String n5() {
      return this.l6 != null ? this.l6 : this.n5.toString();
   }

   public final void n5(String var1) {
      if (this.l6 != null) {
         this.u3();
      }

      switch (b6.k5().n5(var1)) {
         case 2:
            this.n5.n5('<');
            break;
         case 3:
            this.n5.n5('>');
            break;
         case 4:
            this.n5.n5('"');
            break;
         case 5:
            this.n5.n5('\'');
            break;
         case 6:
            this.n5.n5('&');
            break;
         default:
            this.n5.n5('&');
            this.n5.n5(var1);
            this.n5.n5(';');
      }

      this.n5(0, var1);
   }

   public final void n5(char var1) {
      if (this.l6 != null) {
         this.u3();
      }

      this.n5.n5(var1);
      this.n5(1, Character.valueOf(var1));
   }

   public final void n5(char var1, char var2) {
      if (this.l6 != null) {
         this.u3();
      }

      this.n5.n5(var2);
      this.n5.n5(var1);
      this.n5(2, new char[]{var1, var2});
   }

   public final void l6(String var1) {
      if (this.l6 != null) {
         this.u3();
      }

      this.n5.n5(var1);
      this.n5(3, var1);
   }

   public final void k5(String var1) {
      if (this.l6 != null) {
         this.u3();
      } else if (this.a6 == -1) {
         this.l6 = var1;
         return;
      }

      this.n5.n5(var1);
      this.n5(4, var1);
   }

   public final void n5(char[] var1, int var2, int var3) {
      if (this.l6 != null) {
         this.u3();
      }

      this.n5.n5(var1, var2, var3);
      this.n5(5, new b6$l6$n5(var1, var2, var3));
   }

   public final void l6(char[] var1, int var2, int var3) {
      if (this.l6 != null) {
         this.u3();
      }

      this.n5.n5(var1, var2, var3);
      this.n5(7, new b6$l6$n5(var1, var2, var3));
   }

   public final void u3(String var1) {
      if (this.l6 != null) {
         this.u3();
      }

      this.n5.n5(var1);
      this.n5(6, var1);
   }

   public final void a6(String var1) {
      if (this.l6 != null) {
         this.u3();
      }

      this.n5.n5(var1);
      this.n5(8, var1);
   }

   public final void n5(l1 var1) {
      if (this.l6 != null) {
         var1.l6(this.l6);
      } else {
         for (int var2 = this.u3; var2 <= this.a6; var2++) {
            b6$l6$l6 var3 = this.k5[var2];
            switch (var3.n5) {
               case 0:
                  var1.k5((String)var3.l6);
                  break;
               case 1:
                  var1.n5(com.aspose.slides.internal.v6g.k5.u3(var3.l6, char.class));
                  break;
               case 2:
                  char[] var4 = com.aspose.slides.internal.v6g.k5.k5(var3.l6, char[].class);
                  var1.n5(var4[0], var4[1]);
                  break;
               case 3:
                  var1.h0((String)var3.l6);
                  break;
               case 4:
                  var1.l6((String)var3.l6);
                  break;
               case 5:
                  b6$l6$n5 var6 = (b6$l6$n5)var3.l6;
                  var1.n5(var6.n5, var6.l6, var6.k5);
                  break;
               case 6:
                  var1.c8((String)var3.l6);
                  break;
               case 7:
                  b6$l6$n5 var5 = (b6$l6$n5)var3.l6;
                  var1.n5(var5.n5, var5.l6, var5.k5);
                  break;
               case 8:
                  var1.t2((String)var3.l6);
            }
         }
      }
   }

   public final void l6() {
      if (this.l6 != null) {
         this.l6 = f4.j5(this.l6);
      } else {
         String var1 = this.n5.toString();
         String var2 = f4.j5(var1);
         if (!com.aspose.slides.ms.System.d1.a6(var1, var2)) {
            this.n5 = new com.aspose.slides.internal.l7h.a5(var2);
         }

         u4 var3 = u4.n5().l6();

         for (int var4 = this.u3; var4 == this.u3 && var4 <= this.a6; var4++) {
            b6$l6$l6 var5 = this.k5[var4];
            switch (var5.n5) {
               case 3:
                  this.u3++;
                  break;
               case 4:
               case 6:
               case 8:
                  var5.l6 = f4.w1((String)var5.l6);
                  if (((String)var5.l6).length() == 0) {
                     this.u3++;
                  }
                  break;
               case 5:
               case 7:
                  b6$l6$n5 var6 = (b6$l6$n5)var5.l6;

                  int var7;
                  for (var7 = var6.l6 + var6.k5; var6.l6 < var7 && var3.n5(var6.n5[var6.l6]); var6.k5--) {
                     var6.l6++;
                  }

                  if (var6.l6 == var7) {
                     this.u3++;
                  }
            }
         }

         for (int var8 = this.a6; var8 == this.a6 && var8 >= this.u3; var8--) {
            b6$l6$l6 var9 = this.k5[var8];
            switch (var9.n5) {
               case 3:
                  this.a6--;
                  break;
               case 4:
               case 6:
               case 8:
                  var9.l6 = f4.r4((String)var9.l6);
                  if (((String)var9.l6).length() == 0) {
                     this.a6--;
                  }
                  break;
               case 5:
               case 7:
                  b6$l6$n5 var10 = (b6$l6$n5)var9.l6;

                  while (var10.k5 > 0 && var3.n5(var10.n5[var10.l6 + var10.k5 - 1])) {
                     var10.k5--;
                  }

                  if (var10.k5 == 0) {
                     this.a6--;
                  }
            }
         }
      }
   }

   public final void k5() {
      this.l6 = null;
      this.a6 = -1;
      this.u3 = 0;
      this.n5.n5(0);
   }

   private void u3() {
      this.n5.n5(this.l6);
      this.n5(4, this.l6);
      this.l6 = null;
   }

   private void n5(int var1, Object var2) {
      int var3 = this.a6 + 1;
      if (this.k5 == null) {
         this.k5 = new b6$l6$l6[4];
      } else if (this.k5.length == var3) {
         b6$l6$l6[] var4 = new b6$l6$l6[var3 * 2];
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.k5)), com.aspose.slides.ms.System.u3.n5((Object)(var4)), var3);
         this.k5 = var4;
      }

      if (this.k5[var3] == null) {
         this.k5[var3] = new b6$l6$l6();
      }

      this.k5[var3].n5(var1, var2);
      this.a6 = var3;
   }

   // $VF: synthetic method
   b6$l6(v7 var1) {
      this();
   }
}
