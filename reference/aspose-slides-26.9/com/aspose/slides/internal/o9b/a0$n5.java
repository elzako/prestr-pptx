package com.aspose.slides.internal.o9b;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.f4l.g7;
import com.aspose.slides.internal.f4l.j8;
import com.aspose.slides.internal.f4l.v3;
import com.aspose.slides.internal.f4l.v8;

class a0$n5 {
   private static boolean k5(a0 var0) {
      return n5(a0.u9(var0).l6()[0]);
   }

   private static boolean n5(v8 var0) {
      switch (var0.l6()) {
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
            v3 var1 = (v3)var0.n5();
            return n5(var1.n5()) || n5(var1.l6());
         case 268435456:
            return false;
         case 268435457:
            return true;
         case 268435458:
            return false;
         case 268435459:
            return false;
         default:
            throw new ArgumentException("EmfPlusRegionNodeDataType is invalid");
      }
   }

   private static final y1[] u3(a0 var0) {
      return l6(a0.u9(var0).l6()[0]);
   }

   private static y1[] l6(v8 var0) {
      switch (var0.l6()) {
         case 1:
            v3 var8 = (v3)var0.n5();
            y1[] var13 = l6(var8.n5());
            y1[] var17 = l6(var8.l6());
            return n5(var13, var17, var0.l6());
         case 2:
            v3 var7 = (v3)var0.n5();
            y1[] var12 = l6(var7.n5());
            y1[] var16 = l6(var7.l6());
            return n5(var12, var16, var0.l6());
         case 3:
            v3 var6 = (v3)var0.n5();
            y1[] var11 = l6(var6.n5());
            y1[] var15 = l6(var6.l6());
            return n5(var11, var15, var0.l6());
         case 4:
            v3 var5 = (v3)var0.n5();
            y1[] var10 = l6(var5.n5());
            y1[] var14 = l6(var5.l6());
            return n5(var10, var14, var0.l6());
         case 5:
            v3 var4 = (v3)var0.n5();
            y1[] var9 = l6(var4.n5());
            y1[] var3 = l6(var4.l6());
            return n5(var3, var9, 4);
         case 268435456:
            j8 var1 = (j8)var0.n5();
            return new y1[]{new y1(var1.n5().n5(), var1.n5().l6(), var1.n5().k5(), var1.n5().u3())};
         case 268435457:
            g7 var2 = (g7)var0.n5();
            return s3.n5(new a0(a0.n5(var2.n5())));
         case 268435458:
            return new y1[0];
         case 268435459:
            return new y1[]{a0.h0().y4()};
         default:
            throw new ArgumentException("EmfPlusRegionNodeDataType is invalid");
      }
   }

   private static y1[] n5(y1[] var0, y1[] var1, int var2) {
      y1[] var3 = null;
      switch (var2) {
         case 1:
            if (var0.length != 0 && var1.length != 0) {
               List var20 = new List();

               for (y1 var26 : var0) {
                  for (y1 var30 : var1) {
                     y1 var31 = n5(var26, var30);
                     if (!var31.u3()) {
                        l6(var20, var31);
                     }
                  }
               }

               var3 = (y1[])var20.toArray(new y1[0]);
            } else {
               var3 = new y1[0];
            }
            break;
         case 2:
            if (var0.length == 0) {
               var3 = var1;
            } else if (var1.length == 0) {
               var3 = var0;
            } else {
               var3 = n5(var0, var1);
            }
            break;
         case 3:
            if (var0.length == 0) {
               var3 = var1;
            } else if (var1.length == 0) {
               var3 = var0;
            } else {
               y1[] var19 = n5(var0, var1, 1);
               y1[] var21 = n5(var0, var19, 4);
               y1[] var23 = n5(var1, var19, 4);
               var3 = n5(var21, var23);
            }
            break;
         case 4:
            if (var0.length != 0 && var1.length != 0) {
               List var4 = new List();

               for (y1 var8 : var0) {
                  for (y1 var12 : var1) {
                     y1[] var13 = u3(var8.y4(), var12.y4());
                     if (var13.length > 0) {
                        for (y1 var17 : var13) {
                           if (!var17.u3()) {
                              l6(var4, var17);
                           }
                        }
                     }
                  }
               }

               var3 = n5((y1[])var4.toArray(new y1[0]));
            } else {
               var3 = var0;
            }
            break;
         case 5:
            throw new ArgumentException("RegionNodeDataTypeExclude should be used");
         default:
            throw new ArgumentException("Invalid type=" + var2);
      }

      return var3;
   }

   private static y1 n5(y1 var0, y1 var1) {
      return y1.n5(var0, var1);
   }

   private static y1[] n5(y1[] var0, y1[] var1) {
      List var2 = new List();
      var2.addRange(var0);

      for (int var3 = 0; var3 < var1.length; var3++) {
         var2 = n5(var2, var1[var3]);
      }

      return (y1[])var2.toArray(new y1[0]);
   }

   private static List<y1> n5(List<y1> var0, y1 var1) {
      if (k5(var0, var1)) {
         for (int var2 = 0; var2 < var0.size(); var2++) {
            y1 var3 = (y1)var0.get_Item(var2);
            y1 var4 = y1.n5(var3, var1);
            if (var4.k5() > 0.0F) {
               y1[] var5 = l6(var3, var1);
               var0.removeAt(var2);
               if (var0.isEmpty()) {
                  var0.addRange(var5);
               } else {
                  for (int var6 = 0; var6 < var5.length; var6++) {
                     var0 = n5(var0, var5[var6]);
                  }
               }

               return var0;
            }
         }

         l6(var0, var1);
      } else {
         l6(var0, var1);
      }

      return var0;
   }

   private static void l6(List<y1> var0, y1 var1) {
      if (!u3(var0, var1)) {
         boolean var2 = false;

         for (int var3 = 0; var3 < var0.size(); var3++) {
            if (var1.t2() < ((y1)var0.get_Item(var3)).t2()) {
               var0.insertItem(var3, var1);
               var2 = true;
               break;
            }

            if (var1.t2() == ((y1)var0.get_Item(var3)).t2()) {
               for (int var4 = var3; var4 < var0.size(); var4++) {
                  if (var1.a6() < ((y1)var0.get_Item(var4)).a6()) {
                     var0.insertItem(var4, var1);
                     var2 = true;
                     break;
                  }
               }

               if (!var2) {
                  var0.add(var1.y4());
                  var2 = true;
               }

               if (var2) {
                  break;
               }
            }
         }

         if (!var2) {
            var0.add(var1.y4());
         }
      }
   }

   private static boolean k5(List<y1> var0, y1 var1) {
      return var0.find(new d2(var1)) != null;
   }

   private static boolean u3(List<y1> var0, y1 var1) {
      return var0.find(new d5(var1)) != null;
   }

   private static y1[] l6(y1 var0, y1 var1) {
      y1 var2 = n5(var0, var1);
      if (!(var2.s7() > 0.0F) && !(var2.k5() > 0.0F)) {
         return new y1[]{var0, var1};
      } else if (var0.l6(var1)) {
         return new y1[]{var0.y4()};
      } else if (var1.l6(var0)) {
         return new y1[]{var1.y4()};
      } else if (var0.t2() < var1.t2()) {
         return k5(var0, var1);
      } else if (var1.t2() < var0.t2()) {
         return k5(var1, var0);
      } else if (var0.l6() == var1.l6()) {
         y1 var5 = y1.n5(Math.min(var0.a6(), var1.a6()), var0.t2(), Math.max(var0.h0(), var1.h0()), var0.l6());
         return new y1[]{var5};
      } else {
         y1 var3 = y1.n5(Math.min(var0.a6(), var1.a6()), var0.t2(), Math.max(var0.h0(), var1.h0()), Math.min(var0.l6(), var1.l6()));
         if (var0.l6() > var1.l6()) {
            y1 var6 = y1.n5(var0.a6(), Math.min(var0.l6(), var1.l6()), var0.h0(), var0.l6());
            return new y1[]{var3, var6};
         } else {
            y1 var4 = y1.n5(var1.a6(), Math.min(var0.l6(), var1.l6()), var1.h0(), var1.l6());
            return new y1[]{var3, var4};
         }
      }
   }

   private static y1[] k5(y1 var0, y1 var1) {
      new y1();
      new y1();
      new y1();
      if (var0.a6() == var1.a6() && var0.h0() == var1.h0()) {
         y1 var8 = y1.n5(var0.a6(), var0.t2(), var0.h0(), var1.l6());
         return new y1[]{var8};
      }

      if (var0.a6() <= var1.a6()) {
         if (var0.h0() >= var1.h0()) {
            y1 var7 = var0.y4();
            y1 var14 = y1.n5(var1.a6(), var0.l6(), var1.h0(), var1.l6());
            return new y1[]{var7, var14};
         } else {
            y1 var6 = y1.n5(var0.a6(), var0.t2(), var0.h0(), var1.t2());
            if (var0.l6() < var1.l6()) {
               y1 var13 = y1.n5(var0.a6(), var1.t2(), var1.h0(), var0.l6());
               y1 var18 = y1.n5(var1.a6(), var0.l6(), var1.h0(), var1.l6());
               return new y1[]{var6, var13, var18};
            } else if (var0.l6() > var1.l6()) {
               y1 var12 = y1.n5(var0.a6(), var1.t2(), var1.h0(), var1.l6());
               y1 var17 = y1.n5(var0.a6(), var1.l6(), var0.h0(), var0.l6());
               return new y1[]{var6, var12, var17};
            } else {
               y1 var11 = y1.n5(var0.a6(), var1.t2(), var1.h0(), var1.l6());
               return new y1[]{var6, var11};
            }
         }
      } else if (var0.h0() <= var1.h0()) {
         y1 var5 = y1.n5(var0.a6(), var0.t2(), var0.h0(), var1.t2());
         y1 var10 = var1.y4();
         if (var0.l6() > var1.l6()) {
            y1 var16 = y1.n5(var0.a6(), var1.l6(), var0.h0(), var0.l6());
            return new y1[]{var5, var10, var16};
         } else {
            return new y1[]{var5, var10};
         }
      } else {
         y1 var2 = y1.n5(var0.a6(), var0.t2(), var0.h0(), var1.t2());
         if (var0.l6() < var1.l6()) {
            y1 var9 = y1.n5(var1.a6(), var1.t2(), var0.h0(), var0.l6());
            y1 var15 = y1.n5(var1.a6(), var0.l6(), var1.h0(), var1.l6());
            return new y1[]{var2, var9, var15};
         } else {
            y1 var3 = y1.n5(var1.a6(), var1.t2(), var0.h0(), var1.l6());
            y1 var4 = y1.n5(var0.a6(), var1.l6(), var0.h0(), var0.l6());
            return new y1[]{var2, var3, var4};
         }
      }
   }

   private static y1[] u3(y1 var0, y1 var1) {
      y1 var2 = n5(var0, var1);
      if (!var2.u3()) {
         if (var2.l6(var0)) {
            return new y1[0];
         }

         List var3 = new List();
         if (var0.t2() < var2.t2()) {
            var3.addItem(y1.n5(var0.a6(), var0.t2(), var0.h0(), var2.t2()));
         }

         if (var0.a6() < var2.a6()) {
            var3.addItem(y1.n5(var0.a6(), Math.max(var2.t2(), var0.t2()), var2.a6(), Math.min(var2.l6(), var0.l6())));
         }

         if (var0.h0() > var2.h0()) {
            var3.addItem(y1.n5(var2.h0(), Math.max(var2.t2(), var0.t2()), var0.h0(), Math.min(var2.l6(), var0.l6())));
         }

         if (var0.l6() > var2.l6()) {
            var3.addItem(y1.n5(var0.a6(), var2.l6(), var0.h0(), var0.l6()));
         }

         return (y1[])var3.toArray(new y1[0]);
      } else {
         return new y1[]{var0};
      }
   }

   public static y1[] n5(y1[] var0) {
      var0 = l6(var0);
      return k5(var0);
   }

   private static boolean a6(y1 var0, y1 var1) {
      return !(var0.t2() >= var1.l6()) && !(var0.l6() <= var1.t2()) && (var0.a6() == var1.h0() || var0.h0() == var1.a6());
   }

   private static boolean u9(y1 var0, y1 var1) {
      return var0.a6() == var1.a6() && var0.h0() == var1.h0() && (var0.t2() == var1.l6() || var0.l6() == var1.t2());
   }

   private static y1[] l6(y1[] var0) {
      List var1 = new List();
      var1.addRange(var0);
      int var2 = 0;
      boolean var3 = true;

      while (var2 < var1.size() - 1) {
         y1 var4 = (y1)var1.get_Item(var2);

         for (int var5 = var2 + 1; var5 < var1.size(); var5++) {
            y1 var6 = (y1)var1.get_Item(var5);
            if (!var4.u3() && !var6.u3() && a6(var4, var6)) {
               y1[] var7 = l6(var4, var6);
               var1.removeAt(var5);
               var1.removeAt(var2);

               for (int var8 = 0; var8 < var7.length; var8++) {
                  if (var2 + var8 < var1.size()) {
                     var1.insertItem(var2 + var8, var7[var8]);
                  } else {
                     var1.add(var7[var8]);
                  }
               }

               var3 = false;
               break;
            }
         }

         if (var3) {
            var2++;
         } else {
            var3 = true;
         }
      }

      return (y1[])var1.toArray(new y1[0]);
   }

   private static y1[] k5(y1[] var0) {
      List var1 = new List();
      var1.addRange(var0);
      int var2 = 0;
      boolean var3 = true;

      while (var2 < var1.size() - 1) {
         y1 var4 = (y1)var1.get_Item(var2);

         for (int var5 = var2 + 1; var5 < var1.size(); var5++) {
            y1 var6 = (y1)var1.get_Item(var5);
            if (!var4.u3() && !var6.u3() && u9(var4, var6)) {
               var4 = y1.l6(var4, var6);
               var1.removeAt(var5);
               var1.removeAt(var2);
               var1.insertItem(var2, var4);
               var3 = false;
               break;
            }
         }

         if (var3) {
            var2++;
         } else {
            var3 = true;
         }
      }

      return (y1[])var1.toArray(new y1[0]);
   }

   // $VF: synthetic method
   static boolean n5(a0 var0) {
      return k5(var0);
   }

   // $VF: synthetic method
   static y1[] l6(a0 var0) {
      return u3(var0);
   }
}
