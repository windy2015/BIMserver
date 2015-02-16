package fi.ni.ifc2x3;
import java.util.List;

import fi.ni.IfcList;
import fi.ni.Thing;

/*
 * IFC Java class
The MIT License (MIT)

Copyright (c) 2014 Jyrki Oraskari

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
 */

public class IfcVirtualGridIntersection extends Thing 
{
 // The property attributes
 List<IfcGridAxis> intersectingAxes = new IfcList<IfcGridAxis>();
 List<Double> offsetDistances = new IfcList<Double>();


 // Getters and setters of properties

 public List<IfcGridAxis> getIntersectingAxes() {
   return intersectingAxes;

 }
 public void setIntersectingAxes(IfcGridAxis value){
   this.intersectingAxes.add(value);

 }

 public List<Double> getOffsetDistances() {
   return offsetDistances;
 }
 public void setOffsetDistances(String txt){
   List<Double> value = i.toDoubleList(txt);
   this.offsetDistances=value;

 }

}