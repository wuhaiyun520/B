package com.b;

import org.junit.Test;

import java.util.*;

//集合
public class JiHe {

    /**
     * List集合方法
     * 实现类：ArrayList
     */
    @Test
    public void ArrayList(){
        //新建一个ArrayList集合 list
        List<Student> list=new ArrayList<>();
        //将学生对象通过add方法添加到list集合中
        list.add(new Student(22,1,"张三",80));
        list.add(new Student(18,2,"张四",89));
        list.add(new Student(21,3,"李四",87));
        //for循环遍历list，size方法获得list长度，

        for(int i=0;i<list.size()-1;i++){
            for(int j=0;j<list.size()-1-i;j++){
                //利用get方法取得下标j和j+1的值，进行比较，降序排序
                if(list.get(j).getAge()>list.get(j+1).getAge()){
                    Student s=list.get(j);
                    //set方法 将指定的元素替代此列表中指定位置上的元素
                    list.set(j,list.get(j+1));
                    list.set(j+1,s);
                }
            }
        }
        //遍历集合，输出数据
        for(Student stu:list) {
            System.out.println(stu);
        }
        //移除集合中下标为1的数据
        list.remove(1);
        //再次遍历，结果为两条数据
        for(Student stu1:list) {
            System.out.println(stu1);
        }
    }

    /**
     * List集合方法
     * 实现类：LinkedList
     */
    @Test
    public void LinkedList(){
        //定义LinkedList对象
        LinkedList<Student> ll=new LinkedList<>();
        //向中添加数据
        ll.add(new Student(22,1,"丽丽",80));
        //集合中第一个位置添加数据
        ll.addFirst(new Student(18,2,"琪琪",89));
        //集合中最后位置添加数据
        ll.addLast(new Student(21,3,"欣欣",86));
        //集合中指定位置添加数据
        ll.add(1,new Student(16,4,"乖乖",79));
        ll.getFirst();
        //打印长度
        System.out.println(ll.size());
        //遍历输出链表
        for(Student stu2:ll) {
            System.out.println(stu2);
        }

    }

    /**
     * Set集合方法
     * 实现类：TreeSet
     */
    @Test
    public void TreeSet(){
        //定义TreeSet集合对象
        Set<Student> set=new TreeSet<>(new Comparator<Student>() {
            //返回对 set 中的元素进行排序的比较器
            @Override
            public int compare(Student o1, Student o2) {
                return (int)(o1.getScore()-o2.getScore());
            }
        });
        //添加数据
        set.add(new Student(22,1,"张三",80));
        set.add(new Student(18,2,"小四",89));
        set.add(new Student(21,3,"李四",87));
        System.out.println(set.size());
        //返回在此TreeSet中的元素上按升序进行迭代的迭代器
        Iterator it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    /**
     * Set集合方法
     * 实现类：HashSet
     */
    @Test
    public void HashSet(){
        HashSet<Student>  hs=new HashSet<>();
        //添加数据
        hs.add(new Student(22,1,"一一",80));
        hs.add(new Student(18,2,"二二",89));
        hs.add(new Student(21,3,"三三",87));
        System.out.println(hs.size());
        //迭代遍历输出
        Iterator it=hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    /**
     * Queue集合方法
     * 常用实现类：LinkedList
     */
    @Test
    public void Queue(){
        //创建Queue对象
        Queue<Student> queue=new LinkedList<>();
        //调用peek方法：获取但不移除此队列的头；队列为空时，返回 null
        //System.out.println(queue.peek());
        //add方法：向队列中添加数据
        queue.add(new Student(22,1,"一一",80));
        queue.add(new Student(22,2,"二二",85));
        //offer方法：向队列中添加数据，当使用有容量限制的队列时，此方法通常要优于 add(E)
        queue.offer(new Student(22,3,"天",87));
        //遍历队列
        for(Student s:queue){
            System.out.println(s);
        }
        //poll方法：获取并移除此队列的头，队列为空，则返回 null
        queue.poll();
        //调用peek方法：获取但不移除此队列的头；队列为空时，返回 null
        System.out.println(queue.peek());
        //remove方法：获取并移除此队列的头
        queue.remove();
    }

    /**
     * Map集合方法
     * 实现类：HashMap
     */
    @Test
    public void HashMap() {
        //创建map集合
        HashMap map =new HashMap();
        //为学生对象赋值并将学生对象添加到map集合中
        map.put(0,new Student(18,1,"小小",92));
        map.put(1,new Student(20,2,"大大",85));
        map.put(2,new Student(21,3,"天天",75));
        //System.out.println(map.get(s));
       // System.out.println(map.get(s1));
       // System.out.println(map.get(s2));
        //移除map中键为2的数据
        map.remove(2);
        //输出map中所有的值
        System.out.println(map.values());
        //遍历输出集合
        for(int i=0;i<map.size();i++){
            System.out.println(map.get(i));
        }
    }
}
