package com.aspose.slides.internal.g8v;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.Queue;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.ObjectDisposedException;

class v8 {
   private f0 a6;
   private com.aspose.slides.internal.z0k.t4 u9;
   com.aspose.slides.internal.p6w.h0 n5;
   private Object h0 = new Object();
   private z7 c8;
   private int t2;
   private com.aspose.slides.internal.r5t.r4 s7;
   private boolean x8;
   private byte[] n3;
   static com.aspose.slides.ms.System.h0 l6 = new v3();
   private com.aspose.slides.ms.System.i1 y4;
   private v8$n5 e2;
   i9 k5;
   private boolean t9;
   private a6 z1;
   private Queue t4;
   private boolean q0;
   private int z3;
   private w1 m1;
   private a5 k7;
   private boolean m3;
   private boolean z8;
   private int j5;
   private w1 w1;
   private boolean r4;
   private boolean c4;
   private Exception y2;
   static Object u3 = new Object();

   public v8(z7 var1, f0 var2) {
      this.c8 = var1;
      this.a6 = var2;
      this.n3 = new byte[4096];
      this.k5 = new i9();
      this.s7 = new g7(this);
      this.t4 = var1.n5().l6();
      this.e2 = new v8$n5(null);
      this.e2.n5 = this;
      this.y4 = new j4(this);
   }

   private boolean h0() {
      return !this.n5.n5(0, 0);
   }

   private void k5(w1 var1) {
      synchronized (this.h0) {
         if (this.n5 != null && this.n5.l6() && this.t2 == 0 && this.h0() && this.t2()) {
            this.q0 = true;
         } else {
            this.q0 = false;
            if (this.n5 != null) {
               this.n5.h0();
               this.n5 = null;
            }

            this.z1 = null;
            b3 var3 = this.a6.c8();
            if (var3 == null) {
               this.t2 = this.a6.u9() ? 15 : 1;
            } else {
               i1[] var4 = var3.n5();
               int var5 = var4.length;
               int var6 = 0;

               while (true) {
                  label119: {
                     if (var6 < var5) {
                        i1 var7 = var4[var6];

                        try {
                           this.n5 = new com.aspose.slides.internal.p6w.h0(var7.a6(), 1, 6);
                        } catch (Exception var13) {
                           if (!var1.w1()) {
                              this.t2 = 2;
                           }

                           this.y2 = var13;
                           return;
                        }

                        e5 var8 = new e5(var7, this.a6.n5().y4());
                        this.n5.k5(!this.a6.u3());

                        try {
                           this.a6.n5(this.n5);
                        } catch (RuntimeException var12) {
                        }

                        if (!this.a6.n5(this.n5, var8)) {
                           this.n5.h0();
                           this.n5 = null;
                           this.t2 = 2;
                           break label119;
                        }

                        try {
                           if (var1.w1()) {
                              return;
                           }

                           this.n5.l6(var8);
                           this.t2 = 0;
                        } catch (com.aspose.slides.internal.r5t.e2 var14) {
                           com.aspose.slides.internal.p6w.h0 var18 = this.n5;
                           this.n5 = null;
                           if (var18 != null) {
                              var18.h0();
                           }

                           return;
                        } catch (ObjectDisposedException var15) {
                           return;
                        } catch (Exception var16) {
                           com.aspose.slides.internal.p6w.h0 var10 = this.n5;
                           this.n5 = null;
                           if (var10 != null) {
                              var10.h0();
                           }

                           if (!var1.w1()) {
                              this.t2 = 2;
                           }

                           this.y2 = var16;
                           break label119;
                        }
                     }

                     return;
                  }

                  var6++;
               }
            }
         }
      }
   }

   static void n5() {
      synchronized (u3) {
         ;
      }
   }

   private boolean n5(w1 var1, com.aspose.slides.ms.System.r8 var2, com.aspose.slides.internal.z0k.t4 var3, byte[][] var4) {
      com.aspose.slides.internal.l7h.a5 var5 = new com.aspose.slides.internal.l7h.a5();
      var5.n5("CONNECT ");
      var5.n5(var1.n5().a6());
      var5.n5(':');
      var5.k5(var1.n5().y4());
      var5.n5(" HTTP/");
      if (com.aspose.slides.ms.System.b5.n5(var1.z1().k5(), com.aspose.slides.internal.g8v.j5.l6)) {
         var5.n5("1.1");
      } else {
         var5.n5("1.0");
      }

      var5.n5("\r\nHost: ");
      var5.n5(var1.n5().k5());
      boolean var6 = false;
      String[] var7 = this.k5.h0;
      this.k5.h0 = null;
      String var8 = var1.c8().get_Item("Proxy-Authorization");
      boolean var9 = var8 != null;
      if (var9) {
         var5.n5("\r\nProxy-Authorization: ");
         var5.n5(var8);
         var6 = com.aspose.slides.ms.System.d1.t2(com.aspose.slides.ms.System.d1.t2(var8), "NTLM");
      } else if (var7 != null && this.k5.n5 == 407) {
         f2 var10 = var1.y4().n5();
         var9 = true;
         if (this.w1 == null) {
            this.w1 = (w1)b5.l6(com.aspose.slides.ms.System.d1.n5(var2.t9(), "://", var2.a6(), ":", com.aspose.slides.ms.System.a3.l6(var2.y4()), "/"));
            this.w1.n5("CONNECT");
            this.w1.n5(var10);
         }

         for (int var11 = 0; var11 < com.aspose.slides.ms.System.u3.n5((Object)(var7)).a6(); var11++) {
            l6 var12 = com.aspose.slides.internal.g8v.n5.n5(var7[var11], this.w1, var10);
            if (var12 != null) {
               var6 = "NTLM".equals(var12.k5().n5());
               var5.n5("\r\nProxy-Authorization: ");
               var5.n5(var12.n5());
               break;
            }
         }
      }

      if (var6) {
         var5.n5("\r\nProxy-Connection: keep-alive");
         this.j5++;
      }

      var5.n5("\r\n\r\n");
      this.k5.n5 = 0;
      byte[] var15 = com.aspose.slides.internal.l7h.j5.u9().u3(var5.toString());
      var3.write(var15, 0, com.aspose.slides.ms.System.u3.n5((Object)(var15)).a6());
      int var16 = 0;
      int[] var18 = new int[]{0};
      y5 var13 = this.n5(var3, var4, var18);
      var16 = var18[0];
      if ((!var9 || this.j5 == 1) && var13 != null && var16 == 407) {
         String var19 = var13.get_Item("Connection");
         if (this.n5 != null && !com.aspose.slides.ms.System.d1.n5(var19) && "close".equals(com.aspose.slides.ms.System.d1.u9(var19))) {
            this.n5.h0();
            this.n5 = null;
         }

         this.k5.n5 = var16;
         this.k5.h0 = var13.n5("Proxy-Authenticate", false);
         return false;
      } else if (var16 != 200) {
         String var14 = com.aspose.slides.ms.System.d1.n5(
            "The remote server returned a {0} status code.", new Object[]{com.aspose.slides.internal.v6g.k5.l6(var16)}
         );
         this.n5(10, null, var14);
         return false;
      } else {
         return var13 != null;
      }
   }

   private y5 n5(com.aspose.slides.internal.z0k.t4 var1, byte[][] var2, int[] var3) {
      var2[0] = null;
      var3[0] = 200;
      byte[] var4 = new byte[1024];
      com.aspose.slides.internal.z0k.e2 var5 = new com.aspose.slides.internal.z0k.e2();

      while (true) {
         int var6 = var1.read(var4, 0, 1024);
         if (var6 == 0) {
            this.n5(11, null, "ReadHeaders");
            return null;
         }

         var5.write(var4, 0, var6);
         boolean var7 = false;
         Object var8 = null;
         int[] var9 = new int[]{0};
         String[] var10 = new String[]{(String)var8};
         boolean var11 = false;
         y5 var12 = new y5();

         while (n5(var5.getBuffer(), var9, com.aspose.slides.internal.v6g.k5.u3(var5.getLength(), 11), var10)) {
            if (var10[0] == null) {
               int var16 = 0;

               try {
                  var16 = com.aspose.slides.ms.System.a3.n5(var12.get_Item("Content-Length"));
               } catch (RuntimeException var15) {
                  var16 = 0;
               }

               if (var5.getLength() - com.aspose.slides.internal.v6g.k5.u9(var9[0], 9) - com.aspose.slides.internal.v6g.k5.u9(var16, 9) > 0L) {
                  var2[0] = new byte[(int)(var5.getLength() - com.aspose.slides.internal.v6g.k5.u9(var9[0], 9) - com.aspose.slides.internal.v6g.k5.u9(var16, 9))];
                  com.aspose.slides.ms.System.y4.n5(var5.getBuffer(), var9[0] + var16, var2[0], 0, com.aspose.slides.ms.System.u3.n5((Object)(var2[0])).a6());
               } else {
                  this.n5(var1, var16 - com.aspose.slides.internal.v6g.k5.u3(var5.getLength() - com.aspose.slides.internal.v6g.k5.u9(var9[0], 9), 11));
               }

               return var12;
            }

            if (var11) {
               var12.n5(var10[0]);
            } else {
               String[] var13 = com.aspose.slides.ms.System.d1.n5(var10[0], ' ');
               if (com.aspose.slides.ms.System.u3.n5((Object)(var13)).a6() < 2) {
                  this.n5(11, null, "ReadHeaders2");
                  return null;
               }

               if (com.aspose.slides.ms.System.d1.n5(var13[0], "HTTP/1.1", true) == 0) {
                  this.k5.a6 = com.aspose.slides.internal.g8v.j5.l6;
               } else {
                  if (com.aspose.slides.ms.System.d1.n5(var13[0], "HTTP/1.0", true) != 0) {
                     this.n5(11, null, "ReadHeaders2");
                     return null;
                  }

                  this.k5.a6 = com.aspose.slides.internal.g8v.j5.n5;
               }

               var3[0] = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.l4.n5(var13[1]), 10);
               var11 = true;
            }
         }
      }
   }

   private void n5(com.aspose.slides.internal.z0k.t4 var1, int var2) {
      while (var2 > 0) {
         byte[] var3 = new byte[var2];
         int var4 = var1.read(var3, 0, var2);
         if (var4 > 0) {
            var2 -= var4;
            continue;
         }
         break;
      }
   }

   private boolean u3(w1 var1) {
      if (this.q0 && this.u9 != null) {
         return true;
      }

      try {
         com.aspose.slides.internal.p6w.u9 var2 = new com.aspose.slides.internal.p6w.u9(this.n5, false);
         if (com.aspose.slides.ms.System.d1.a6(var1.n5().t9(), com.aspose.slides.ms.System.r8.u9)) {
            this.r4 = true;
            n5();
            if (!this.q0
               || this.u9 == null
               || com.aspose.slides.ms.System.j8.n5(this.u9).l6(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.y4g.k5.class))) {
               byte[] var3 = null;
               if (this.a6.h0()) {
                  byte[][] var4 = new byte[][]{var3};
                  boolean var5 = this.n5(var1, this.a6.n5(), var2, var4);
                  var3 = var4[0];
                  if (!var5) {
                     return false;
                  }
               }

               this.u9 = new com.aspose.slides.internal.y4g.k5(var2, var1.u3(), var1, var3);
               this.c4 = false;
            }
         } else {
            this.r4 = false;
            this.u9 = var2;
         }

         return true;
      } catch (RuntimeException var6) {
         if (!var1.w1()) {
            this.t2 = 2;
         }

         return false;
      }
   }

   private void n5(int var1, Exception var2, String var3) {
      this.t2 = var1;
      synchronized (this) {
         if (var1 == 6) {
            this.k5 = new i9();
         }
      }

      if (var2 == null) {
         try {
            throw new Exception();
         } catch (Exception var6) {
            var2 = var6;
         }
      }

      w1 var4 = null;
      if (this.k5 != null && this.k5.n5() != null) {
         var4 = this.k5.n5();
      }

      this.n5(true);
      if (var4 != null) {
         var4.k5(true);
         var4.n5(var1, var2, var3);
      }
   }

   static void n5(com.aspose.slides.ms.System.z7 var0) {
      v8 var1 = (v8)var0.n5();
      i9 var2 = var1.k5;
      com.aspose.slides.internal.z0k.t4 var3 = var1.u9;
      if (var3 == null) {
         var1.n5(true);
      } else {
         int var4 = -1;

         try {
            var4 = var3.endRead(var0);
         } catch (ObjectDisposedException var14) {
            return;
         } catch (Exception var15) {
            if (com.aspose.slides.internal.v6g.k5.l6(var15.getInnerException(), ObjectDisposedException.class)) {
               return;
            }

            var1.n5(3, var15, "ReadDone1");
            return;
         }

         if (var4 == 0) {
            var1.n5(3, null, "ReadDone2");
         } else if (var4 < 0) {
            var1.n5(11, null, "ReadDone3");
         } else {
            int var5 = -1;
            var4 += var1.z3;
            if (var2.l6() == 0) {
               Exception var6 = null;

               try {
                  var5 = n5(var2, var1.a6, var1.n3, var4);
               } catch (Exception var13) {
                  var6 = var13;
               }

               if (var6 != null || var5 == -1) {
                  var1.n5(11, var6, "ReadDone4");
                  return;
               }
            }

            if (var2.l6() == 4) {
               var1.n5(6, null, "ReadDone");
            } else if (var2.l6() != 3) {
               int var19 = var4 * 2;
               int var20 = var19 < com.aspose.slides.ms.System.u3.n5((Object)(var1.n3)).a6() ? com.aspose.slides.ms.System.u3.n5((Object)(var1.n3)).a6() : var19;
               byte[] var21 = new byte[var20];
               com.aspose.slides.ms.System.y4.n5(var1.n3, 0, var21, 0, var4);
               var1.n3 = var21;
               var1.z3 = var4;
               var2.n5(0);
               n5((Object)var1);
            } else {
               var1.z3 = 0;
               p6 var18 = new p6(var1, var2);
               boolean var7 = n5(var2.n5, var2.n5().n3());
               String var8 = null;
               if (var7) {
                  var8 = var2.k5.get_Item("Transfer-Encoding");
               }

               var1.t9 = var8 != null && com.aspose.slides.ms.System.d1.u9(var8, "chunked", (short)5) != -1;
               if (!var1.t9) {
                  var18.n5(var1.n3);
                  var18.n5(var5);
                  var18.l6(var4);

                  try {
                     var18.n5();
                  } catch (Exception var12) {
                     var1.n5(3, var12, "ReadDone7");
                  }
               } else if (var1.z1 == null) {
                  try {
                     var1.z1 = new a6(var1.n3, var5, var4, var2.k5);
                  } catch (Exception var11) {
                     var1.n5(11, var11, "ReadDone5");
                     return;
                  }
               } else {
                  var1.z1.n5();

                  try {
                     var1.z1.l6(var1.n3, var5, var4);
                  } catch (Exception var10) {
                     var1.n5(11, var10, "ReadDone6");
                     return;
                  }
               }

               var2.u9 = var18;
               if (!var7) {
                  var18.u9();
               }

               var2.n5().n5(var2);
            }
         }
      }
   }

   static boolean n5(int var0, String var1) {
      return "HEAD".equals(var1) ? false : var0 >= 200 && var0 != 204 && var0 != 304;
   }

   void n5(com.aspose.slides.internal.z0k.t4 var1) {
      com.aspose.slides.internal.f3c.u9 var2 = ((com.aspose.slides.internal.y4g.y4)var1).k5();
      com.aspose.slides.internal.f3c.u9 var3 = ((com.aspose.slides.internal.y4g.y4)var1).h0();
      this.a6.n5(var2, var3);
      this.c4 = var3 != null;
   }

   static void n5(Object var0) {
      v8 var1 = (v8)var0;
      com.aspose.slides.internal.z0k.t4 var2 = var1.u9;

      try {
         int var3 = com.aspose.slides.ms.System.u3.n5((Object)(var1.n3)).a6() - var1.z3;
         var2.beginRead(var1.n3, var1.z3, var3, l6, var1);
      } catch (Exception var4) {
         var1.n5(3, var4, "InitRead");
      }
   }

   static int n5(i9 var0, f0 var1, byte[] var2, int var3) {
      int var4 = 0;
      String var5 = null;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;

      while (var0.l6() != 4) {
         label114: {
            if (var0.l6() == 0) {
               int[] var9 = new int[]{var4};
               String[] var10 = new String[]{var5};
               var6 = n5(var2, var9, var3, var10);
               var4 = var9[0];
               var5 = var10[0];
               if (!var6) {
                  return 0;
               }

               if (var5 == null) {
                  var8 = true;
                  break label114;
               }

               var8 = false;
               var0.n5(1);
               String[] var11 = com.aspose.slides.ms.System.d1.n5(var5, ' ');
               if (com.aspose.slides.ms.System.u3.n5((Object)(var11)).a6() < 2) {
                  return -1;
               }

               if (com.aspose.slides.ms.System.d1.n5(var11[0], "HTTP/1.1", true) == 0) {
                  var0.u3 = com.aspose.slides.internal.g8v.j5.l6;
                  var1.n5(com.aspose.slides.internal.g8v.j5.l6);
               } else {
                  var0.u3 = com.aspose.slides.internal.g8v.j5.n5;
                  var1.n5(com.aspose.slides.internal.g8v.j5.n5);
               }

               var0.n5 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.l4.n5(var11[1]), 10);
               if (com.aspose.slides.ms.System.u3.n5((Object)(var11)).a6() >= 3) {
                  var0.l6 = com.aspose.slides.ms.System.d1.n5(" ", var11, 2, com.aspose.slides.ms.System.u3.n5((Object)(var11)).a6() - 2);
               } else {
                  var0.l6 = "";
               }

               if (var4 >= var3) {
                  return var4;
               }
            }

            var8 = false;
            if (var0.l6() == 1) {
               var0.n5(2);
               var0.k5 = new y5();
               ArrayList var19 = new ArrayList();
               boolean var20 = false;

               while (!var20) {
                  int[] var21 = new int[]{var4};
                  String[] var12 = new String[]{var5};
                  boolean var13 = !n5(var2, var21, var3, var12);
                  var4 = var21[0];
                  var5 = var12[0];
                  if (var13) {
                     break;
                  }

                  if (var5 == null) {
                     var20 = true;
                  } else if (var5.length() > 0 && (var5.charAt(0) == ' ' || var5.charAt(0) == '\t')) {
                     int var14 = var19.size() - 1;
                     if (var14 < 0) {
                        break;
                     }

                     String var15 = com.aspose.slides.ms.System.d1.n5(new String[]{(String)var19.get_Item(var14), var5});
                     var19.set_Item(var14, var15);
                  } else {
                     var19.addItem(var5);
                  }
               }

               if (!var20) {
                  return 0;
               }

               for (Object recoveredElement$var23$19514 : var19) {
                  String var23 = (String)recoveredElement$var23$19514;
                  var0.k5.l6(var23);
               }

               if (var0.n5 != 100) {
                  var0.n5(3);
                  return var4;
               }

               var1.k5(true);
               if (var4 >= var3) {
                  return var4;
               }

               if (var0.n5().z3()) {
                  var0.n5().n5(var0.n5, var0.k5);
                  var0.n5().l6(false);
               }

               var0.n5(0);
               var7 = true;
            }
         }

         if (!var8 && !var7) {
            return -1;
         }
      }

      return -1;
   }

   private void l6(Object var1) {
      w1 var2 = (w1)var1;
      var2.n5 = this;
      if (var2.y2()) {
         var2.k5 = this;
      }

      if (!var2.w1()) {
         this.x8 = var2.s7();
         this.k5 = new i9(var2);

         int var3;
         do {
            this.k5(var2);
            if (var2.w1()) {
               return;
            }

            if (this.t2 != 0) {
               if (!var2.w1()) {
                  var2.n5(this.t2, this.y2);
                  this.n5(true);
               }

               return;
            }

            if (this.u3(var2)) {
               var2.n5(new p6(this, var2));
               return;
            }

            if (var2.w1()) {
               return;
            }

            var3 = this.t2;
         } while (this.k5.h0 != null);

         Exception var4 = this.y2;
         this.y2 = null;
         var2.n5(var3, var4);
         this.n5(true);
      }
   }

   com.aspose.slides.ms.System.i1 n5(w1 var1) {
      if (var1.w1()) {
         return null;
      }

      synchronized (this) {
         if (this.c8.l6()) {
            this.t2 = 0;
            com.aspose.slides.internal.r5t.z1.n5(this.s7, var1);
         } else {
            synchronized (this.t4) {
               this.t4.enqueue(var1);
            }
         }
      }

      return this.y4;
   }

   private void c8() {
      synchronized (this.t4) {
         if (this.t4.size() > 0) {
            this.n5((w1)this.t4.dequeue());
         }
      }
   }

   void l6() {
      synchronized (this) {
         if (this.k5.n5() != null) {
            this.k5.n5().k5(true);
         }

         String var2 = this.a6.u9() ? "Proxy-Connection" : "Connection";
         String var3 = this.k5.k5 != null ? this.k5.k5.get_Item(var2) : null;
         boolean var4 = com.aspose.slides.ms.System.b5.n5(this.k5.u3, com.aspose.slides.internal.g8v.j5.l6) && this.x8;
         if (this.k5.a6 != null && com.aspose.slides.ms.System.b5.l6(this.k5.a6, com.aspose.slides.internal.g8v.j5.l6)) {
            var4 = false;
         }

         if (var3 != null) {
            var3 = com.aspose.slides.ms.System.d1.u9(var3);
            var4 = this.x8 && com.aspose.slides.ms.System.d1.u9(var3, "keep-alive", (short)4) != -1;
         }

         if (this.n5 != null && !this.n5.l6() || !var4 || var3 != null && com.aspose.slides.ms.System.d1.u9(var3, "close", (short)4) != -1) {
            this.n5(false);
         }

         this.c8.k5();
         if (this.m1 != null) {
            this.n5(this.m1);
            this.m1 = null;
         } else {
            this.c8();
         }
      }
   }

   static boolean n5(byte[] var0, int[] var1, int var2, String[] var3) {
      boolean var4 = false;
      com.aspose.slides.internal.l7h.a5 var5 = new com.aspose.slides.internal.l7h.a5();

      int var6;
      for (var6 = 0; var1[0] < var2; var5.n5(com.aspose.slides.internal.v6g.k5.x8(var6, 9))) {
         var6 = com.aspose.slides.internal.v6g.k5.u3(var0[var1[0]++], 6);
         if (var6 == 10) {
            if (var5.l6() > 0 && var5.l6(var5.l6() - 1) == '\r') {
               var5.n5(var5.l6() - 1);
            }

            var4 = false;
            break;
         }

         if (var4) {
            var5.n5(var5.l6() - 1);
            break;
         }

         if (var6 == 13) {
            var4 = true;
         }
      }

      if (var6 != 10 && var6 != 13) {
         return false;
      }

      if (var5.l6() != 0) {
         if (var4) {
            var5.n5(var5.l6() - 1);
         }

         var3[0] = var5.toString();
         return true;
      } else {
         var3[0] = null;
         return var6 == 10 || var6 == 13;
      }
   }

   com.aspose.slides.ms.System.z7 n5(w1 var1, byte[] var2, int var3, int var4, com.aspose.slides.ms.System.h0 var5, Object var6) {
      com.aspose.slides.internal.z0k.t4 var7 = null;
      synchronized (this) {
         if (this.k5.n5() != var1) {
            throw new ObjectDisposedException(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.p6w.u9.class).q0());
         }

         if (this.u9 == null) {
            return null;
         }

         var7 = this.u9;
      }

      com.aspose.slides.ms.System.z7 var8 = null;
      if (!this.t9 || !this.z1.k5() && this.z1.l6()) {
         try {
            var8 = var7.beginRead(var2, var3, var4, var5, var6);
            var5 = null;
         } catch (Exception var10) {
            this.n5(3, null, "chunked BeginRead");
            throw var10;
         }
      }

      if (this.t9) {
         s0 var9 = new s0(var5, var6, var2, var3, var4);
         var9.n5(var8);
         if (var8 == null) {
            var9.n5(true, (Exception)null);
            var9.x8();
         }

         return var9;
      } else {
         return var8;
      }
   }

   int n5(w1 var1, com.aspose.slides.ms.System.z7 var2) {
      com.aspose.slides.internal.z0k.t4 var3 = null;
      synchronized (this) {
         if (this.k5.n5() != var1) {
            throw new ObjectDisposedException(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.p6w.u9.class).q0());
         }

         if (this.u9 == null) {
            throw new ObjectDisposedException(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.p6w.u9.class).q0());
         }

         var3 = this.u9;
      }

      int var4 = 0;
      boolean var5 = false;
      s0 var6 = null;
      com.aspose.slides.ms.System.z7 var7 = ((s0)var2).y4();
      if (this.t9 && com.aspose.slides.internal.v6g.k5.l6(var7, s0.class)) {
         var6 = (s0)var7;
         com.aspose.slides.ms.System.z7 var8 = var6.y4();
         if (var8 != null && !com.aspose.slides.internal.v6g.k5.l6(var8, s0.class)) {
            var4 = var3.endRead(var8);
            var5 = var4 == 0;
         }
      } else if (!com.aspose.slides.internal.v6g.k5.l6(var7, s0.class)) {
         var4 = var3.endRead(var7);
         var6 = (s0)var2;
         var5 = var4 == 0;
      }

      if (this.t9) {
         try {
            int[] var12 = new int[]{var4};
            this.z1.n5(var6.t9(), var6.z1(), var6.t4(), var12);
            var4 = var12[0];
            if (!var5 && var4 == 0 && this.z1.l6()) {
               var4 = this.n5(var6.t9(), var6.z1(), var6.t4());
            }
         } catch (Exception var9) {
            if (com.aspose.slides.internal.v6g.k5.l6(var9, a7.class)) {
               throw var9;
            }

            throw new a7("Invalid chunked data.", var9, 11, null);
         }

         if ((var5 || var4 == 0) && this.z1.u3() != 0) {
            this.n5(3, null, "chunked EndRead");
            throw new a7("Read error", null, 3, null);
         }
      }

      return var4 != 0 ? var4 : -1;
   }

   private int n5(byte[] var1, int var2, int var3) {
      byte[] var4 = null;
      int var5 = 0;

      while (var5 == 0 && this.z1.l6()) {
         int var6 = this.z1.u3();
         if (var6 <= 0) {
            var6 = 1024;
         } else if (var6 > 16384) {
            var6 = 16384;
         }

         if (var4 == null || com.aspose.slides.ms.System.u3.n5((Object)(var4)).a6() < var6) {
            var4 = new byte[var6];
         }

         int var7 = this.u9.read(var4, 0, var6);
         if (var7 <= 0) {
            return 0;
         }

         this.z1.l6(var4, 0, var7);
         var5 += this.z1.n5(var1, var2 + var5, var3 - var5);
      }

      return var5;
   }

   private boolean t2() {
      if (this.t9 && this.z1 != null) {
         while (this.z1.l6()) {
            int var1 = this.u9.read(this.n3, 0, com.aspose.slides.ms.System.u3.n5((Object)(this.n3)).a6());
            if (var1 <= 0) {
               return false;
            }

            this.z1.l6(this.n3, 0, var1);
         }

         return true;
      } else {
         return true;
      }
   }

   com.aspose.slides.ms.System.z7 l6(w1 var1, byte[] var2, int var3, int var4, com.aspose.slides.ms.System.h0 var5, Object var6) {
      com.aspose.slides.internal.z0k.t4 var7 = null;
      synchronized (this) {
         if (this.k5.n5() != var1) {
            throw new ObjectDisposedException(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.p6w.u9.class).q0());
         }

         if (this.u9 == null) {
            return null;
         }

         var7 = this.u9;
      }

      Object var8 = null;

      try {
         return var7.beginWrite(var2, var3, var4, var5, var6);
      } catch (Exception var10) {
         this.t2 = 4;
         throw var10;
      }
   }

   boolean n5(w1 var1, boolean var2, com.aspose.slides.ms.System.z7 var3) {
      if (var1.j5()) {
         return true;
      }

      com.aspose.slides.internal.z0k.t4 var4 = null;
      synchronized (this) {
         if (this.k5.n5() != var1) {
            throw new ObjectDisposedException(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.p6w.u9.class).q0());
         }

         if (this.u9 == null) {
            throw new ObjectDisposedException(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.p6w.u9.class).q0());
         }

         var4 = this.u9;
      }

      try {
         var4.endWrite(var3);
         return true;
      } catch (Exception var7) {
         this.t2 = 4;
         if (var2 && var7.getInnerException() != null) {
            throw var7;
         } else {
            return false;
         }
      }
   }

   int n5(w1 var1, byte[] var2, int var3, int var4) {
      com.aspose.slides.internal.z0k.t4 var5 = null;
      synchronized (this) {
         if (this.k5.n5() != var1) {
            throw new ObjectDisposedException(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.p6w.u9.class).q0());
         }

         if (this.u9 == null) {
            return 0;
         }

         var5 = this.u9;
      }

      int var6 = 0;

      try {
         boolean var7 = false;
         if (!this.t9) {
            var6 = var5.read(var2, var3, var4);
            var7 = var6 == 0;
         }

         if (this.t9) {
            try {
               int[] var8 = new int[]{var6};
               this.z1.n5(var2, var3, var4, var8);
               var6 = var8[0];
               if (!var7 && var6 == 0 && this.z1.l6()) {
                  var6 = this.n5(var2, var3, var4);
               }
            } catch (Exception var9) {
               this.n5(3, var9, "chunked Read1");
               throw var9;
            }

            if ((var7 || var6 == 0) && this.z1.l6()) {
               this.n5(3, null, "chunked Read2");
               throw new a7("Read error", null, 3, null);
            }
         }
      } catch (Exception var10) {
         this.n5(3, var10, "Read");
      }

      return var6;
   }

   boolean n5(w1 var1, byte[] var2, int var3, int var4, String[] var5) {
      var5[0] = null;
      com.aspose.slides.internal.z0k.t4 var6 = null;
      synchronized (this) {
         if (this.k5.n5() != var1) {
            throw new ObjectDisposedException(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.p6w.u9.class).q0());
         }

         var6 = this.u9;
         if (var6 == null) {
            return false;
         }
      }

      try {
         var6.write(var2, var3, var4);
         if (this.r4 && !this.c4) {
            this.n5(var6);
         }

         return true;
      } catch (Exception var10) {
         var5[0] = var10.getMessage();
         byte var8 = 4;
         String var9 = com.aspose.slides.ms.System.d1.n5(new String[]{"Write: ", var5[0]});
         if (com.aspose.slides.internal.v6g.k5.l6(var10, a7.class)) {
            this.n5(var8, var10, var9);
            return false;
         }

         if (this.r4 && ((com.aspose.slides.internal.y4g.k5)var6).n5()) {
            var8 = 9;
            var9 = "Trust failure";
         }

         this.n5(var8, var10, var9);
         return false;
      }
   }

   void n5(boolean var1) {
      synchronized (this) {
         if (this.k5 != null && this.k5.n5() != null && this.k5.n5().y2()) {
            this.k5.n5().u3(false);
         } else {
            if (this.u9 != null) {
               try {
                  this.u9.close();
               } catch (RuntimeException var8) {
               }

               this.u9 = null;
            }

            if (this.n5 != null) {
               try {
                  this.n5.h0();
               } catch (RuntimeException var7) {
               }

               this.n5 = null;
            }

            if (this.m3) {
               this.k5();
            }

            if (this.k5 != null) {
               synchronized (this.k5) {
                  this.k5.n5(4);
               }
            }

            this.c8.k5();
            this.k5 = new i9();
            if (var1) {
               this.c8();
            }

            this.w1 = null;
            this.j5 = 0;
         }
      }
   }

   private void n5(Object var1, com.aspose.slides.ms.System.f2 var2) {
      synchronized (this) {
         synchronized (this.t4) {
            w1 var5 = (w1)var1;
            if (this.k5.n5() == var5 || this.k5.n5() == null) {
               if (!var5.j5()) {
                  this.t2 = 6;
                  this.n5(false);
                  if (this.t4.size() > 0) {
                     this.k5.n5((w1)this.t4.dequeue());
                     this.n5(this.k5.n5());
                     return;
                  }
               }

               return;
            }

            var5.k5(true);
            var5.n5(6, null, "User aborted");
            if (this.t4.size() > 0 && this.t4.peek() == var1) {
               this.t4.dequeue();
            } else if (this.t4.size() > 0) {
               Object[] var6 = this.t4.toArray(new Object[0]);
               this.t4.clear();

               for (int var7 = com.aspose.slides.ms.System.u3.n5((Object)(var6)).a6() - 1; var7 >= 0; var7--) {
                  if (var6[var7] != var1) {
                     this.t4.enqueue(var6[var7]);
                  }
               }
            }
         }
      }
   }

   void k5() {
      this.m3 = false;
      this.k7 = null;
      this.z8 = false;
   }

   void l6(w1 var1) {
      this.m1 = var1;
   }

   boolean u3() {
      return this.m3;
   }

   void l6(boolean var1) {
      this.m3 = var1;
   }

   a5 a6() {
      return this.k7;
   }

   void n5(a5 var1) {
      this.k7 = var1;
   }

   boolean u9() {
      return this.z8;
   }

   void k5(boolean var1) {
      this.z8 = var1;
   }

   // $VF: synthetic method
   static void n5(v8 var0, Object var1) {
      var0.l6(var1);
   }

   // $VF: synthetic method
   static v8$n5 n5(v8 var0) {
      return var0.e2;
   }

   // $VF: synthetic method
   static void n5(v8 var0, Object var1, com.aspose.slides.ms.System.f2 var2) {
      var0.n5(var1, var2);
   }
}
